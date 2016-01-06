package tutorial;

import java.util.Arrays;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import tutorial.persistence.BettingPool;

import com.meterware.httpunit.AuthorizationRequiredException;
import com.meterware.httpunit.IllegalRequestParameterException;
import com.meterware.httpunit.SubmitButton;
import com.meterware.httpunit.WebConversation;
import com.meterware.httpunit.WebForm;
import com.meterware.httpunit.WebRequest;
import com.meterware.httpunit.WebResponse;
import com.meterware.httpunit.WebTable;
import com.meterware.servletunit.InvocationContext;
import com.meterware.servletunit.ServletRunner;
import com.meterware.servletunit.ServletUnitClient;

public class PoolEditorTest extends TestCase
{

    public static void main(String args[])
    {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite()
    {
        return new TestSuite(PoolEditorTest.class);
    }

    public PoolEditorTest(String s)
    {
        super(s);
    }

    public void testGetForm() throws Exception
    {
        // (1) use the web.xml file to define mappings
        ServletRunner sr = new ServletRunner("src/test/resources/web.xml");
        // (2) create a client to invoke the application
        ServletUnitClient client = sr.newClient();

        try
        {
            // (3) invoke the servlet w/o authorization
            client.getResponse("http://localhost/PoolEditor");
            fail("PoolEditor is not protected");
        }
        catch (AuthorizationRequiredException e)
        { // (4) verify that access is denied
          // e.printStackTrace();
        }

        // (5) specify authorization and invoke the servlet again
        client.setAuthorization("aUser1", "pool-admin");
        client.getResponse("http://localhost/PoolEditor");
    }

    public void testFormAction() throws Exception
    {
        ServletRunner sr = new ServletRunner("src/test/resources/web.xml");
        ServletUnitClient client = sr.newClient();
        client.setAuthorization("aUser", "pool-admin");
        WebResponse response = client.getResponse("http://localhost/PoolEditor");

        // (1) obtain the desired form
        WebForm form = response.getFormWithID("pool");
        assertNotNull("No form found with ID 'pool'", form);
        // (2) verify that the form uses POST
        assertEquals("Form method", "POST", form.getMethod());
        // (3) verify that the default action is used
        assertEquals("Form action", "", form.getAction());
    }

    public void testFormContents() throws Exception
    {
        ServletRunner sr = new ServletRunner("src/test/resources/web.xml");
        ServletUnitClient client = sr.newClient();
        client.setAuthorization("aUser", "pool-admin");
        WebResponse response = client.getResponse("http://localhost/PoolEditor");

        WebForm form = response.getFormWithID("pool");
        assertNotNull("No form found with ID 'pool'", form);

        for (int i = 0; i < 10; i++)
        {
            // (1) text parameter
            assertTrue("Missing home team " + i, form.isTextParameter("home" + i));
            // (1) text parameter
            assertTrue("Missing away team " + i, form.isTextParameter("away" + i));
        }
        // (2) radio button
        assertEquals("Tie breaker values",
                Arrays.asList(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}),
                Arrays.asList(form.getOptionValues("tiebreaker")));
    }

    public void testSubmitButtons() throws Exception
    {
        ServletRunner sr = new ServletRunner("src/test/resources/web.xml");
        ServletUnitClient client = sr.newClient();
        client.setAuthorization("aUser", "pool-admin");
        WebResponse response = client.getResponse("http://localhost/PoolEditor");

        WebForm form = response.getFormWithID("pool");
        assertNotNull("No form found with ID 'pool'", form);

        // (1) count the buttons
        assertEquals("Number of submit buttons", 2, form.getSubmitButtons().length);
        // (2) look up by name
        assertNotNull("Save button not found", form.getSubmitButton("save", "Save"));
        assertNotNull("Open Pool button not found", form.getSubmitButton("save", "Open Pool"));
    }

    public void setUp() throws Exception
    {
        BettingPool.reset();
    }

    public void testPoolDisplay() throws Exception
    {
        // (1) set up data
        BettingPool.getGames()[0].setAwayTeam("New York Jets");
        BettingPool.getGames()[0].setHomeTeam("Philadelphia Eagles");
        BettingPool.getGames()[2].setAwayTeam("St. Louis Rams");
        BettingPool.getGames()[2].setHomeTeam("Chicago Bears");
        BettingPool.setTieBreakerIndex(2);

        ServletRunner sr = new ServletRunner("src/test/resources/web.xml");
        ServletUnitClient client = sr.newClient();
        client.setAuthorization("aUser", "pool-admin");
        WebResponse response = client.getResponse("http://localhost/PoolEditor");

        WebForm form = response.getFormWithID("pool");
        assertNotNull("No form found with ID 'pool'", form);

        // (2) check team names
        assertEquals("Away team 0", "New York Jets", form.getParameterValue("away0"));
        assertEquals("Home team 0", "Philadelphia Eagles", form.getParameterValue("home0"));
        assertEquals("Away team 1", "", form.getParameterValue("away1"));
        assertEquals("Home team 1", "", form.getParameterValue("home1"));
        assertEquals("Away team 2", "St. Louis Rams", form.getParameterValue("away2"));
        assertEquals("Home team 2", "Chicago Bears", form.getParameterValue("home2"));

        // (3) check radio button
        assertEquals("Tie breaker game", "2", form.getParameterValue("tiebreaker"));
    }

    public void testPoolEntry() throws Exception
    {
        ServletRunner sr = new ServletRunner("src/test/resources/web.xml");
        ServletUnitClient client = sr.newClient();
        client.setAuthorization("aUser", "pool-admin");
        WebResponse response = client.getResponse("http://localhost/PoolEditor");

        WebForm form = response.getFormWithID("pool");
        assertNotNull("No form found with ID 'pool'", form);

        // (1) enter values into the form
        form.setParameter("away1", "Detroit Lions");
        form.setParameter("home1", "Denver Broncos");
        form.setParameter("tiebreaker", "1");

        // (2) select the desired submit button
        SubmitButton saveButton = form.getSubmitButton("save", "Save");
        // (3) submit the form
        response = form.submit(saveButton);

        // (4) verify the response
        assertEquals("Away team 0", "", form.getParameterValue("away0"));
        assertEquals("Home team 0", "", form.getParameterValue("home0"));
        assertEquals("Away team 1", "Detroit Lions", form.getParameterValue("away1"));
        assertEquals("Home team 1", "Denver Broncos", form.getParameterValue("home1"));

        assertEquals("Tie breaker game", "1", form.getParameterValue("tiebreaker"));
    }

    public void testPoolValidation() throws Exception
    {
        ServletRunner sr = new ServletRunner("src/test/resources/web.xml");
        ServletUnitClient client = sr.newClient();
        client.setAuthorization("aUser", "pool-admin");
        WebResponse response = client.getResponse("http://localhost/PoolEditor");
        WebForm form = response.getFormWithID("pool");

        form.setParameter("away1", "Detroit Lions");
        form.setParameter("home1", "Denver Broncos");
        form.setParameter("home2", "Baltimore Ravens");
        form.setParameter("tiebreaker", "3");
        // (1) select the request object directly
        WebRequest request = form.getRequest("save", "Open Pool");
        // (2) create an invocation context
        InvocationContext context = client.newInvocation(request);

        // (3) locate the invoked servlet
        PoolEditorServlet servlet = (PoolEditorServlet) context.getServlet();
        // (4) ask servlet to update the data
        servlet.updateBettingPool(context.getRequest());
        // (5) ask servlet to check the data
        String[] errors = servlet.getValidationErrors();
        assertEquals("Number of errors reported", 2, errors.length);
        assertEquals("First error", "Tiebreaker is not a valid game", errors[0]);
        assertEquals("Second error", "Game 2 has no away team", errors[1]);
    }

    public void testBadPoolOpen() throws Exception
    {
        ServletRunner sr = new ServletRunner("src/test/resources/web.xml");
        ServletUnitClient client = sr.newClient();
        client.setAuthorization("aUser", "pool-admin");
        WebResponse response = client.getResponse("http://localhost/PoolEditor");
        WebForm form = response.getFormWithID("pool");

        // (1) enter bad values into the form
        form.setParameter("away1", "Detroit Lions");
        form.setParameter("home1", "Denver Broncos");
        form.setParameter("home2", "Baltimore Ravens");
        form.setParameter("tiebreaker", "3");

        // (2) select the desired submit button
        SubmitButton saveButton = form.getSubmitButton("save", "Open Pool");
        // (3) submit the form
        response = form.submit(saveButton);

        // (4) Look for the error table
        WebTable errorTable = response.getTableWithID("errors");
        assertNotNull("No errors reported", errorTable);
        // (5) Remove any empty cells from the table
        errorTable.purgeEmptyCells();
        // (6) Convert non-empty cells to text
        String[][] cells = errorTable.asText();
        assertEquals("Number of error messages provided", 2, cells.length - 1);
        assertEquals("Error message", "Tiebreaker is not a valid game", cells[1][1]);
        assertEquals("Error message", "Game 2 has no away team", cells[2][1]);
    }

    public void testGoodPoolOpen() throws Exception
    {
        ServletRunner sr = new ServletRunner("src/test/resources/web.xml");
        ServletUnitClient client = sr.newClient();
        client.setAuthorization("aUser", "pool-admin");
        WebResponse response = client.getResponse("http://localhost/PoolEditor");
        WebForm form = response.getFormWithID("pool");

        form.setParameter("away1", "Detroit Lions");
        form.setParameter("home1", "Denver Broncos");
        form.setParameter("away3", "Indianapolis Colts");
        form.setParameter("home3", "Baltimore Ravens");
        form.setParameter("tiebreaker", "3");
        // (1) click the submit button
        form.getSubmitButton("save", "Open Pool").click();

        // (2) retrieve the page separately
        response = client.getResponse("http://localhost/PoolEditor");
        form = response.getFormWithID("pool");
        // (3) look for the buttons
        assertNull("Could still update the pool", form.getSubmitButton("save"));

        try
        {
            WebRequest request = form.getRequest();
            // (4) try to change an entry
            request.setParameter("home3", "Philadelphia Eagles");
            fail("Could still edit the pool");
        }
        catch (IllegalRequestParameterException e)
        {
        }
    }

}