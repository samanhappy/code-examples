package test;

import org.junit.Test;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class HttpUnitTest
{
    @Test
    public void homePage() throws Exception {
        try (final WebClient webClient = new WebClient())
        {
            final HtmlPage page = webClient.getPage("http://www.toutiao.com/a6467052999819067662/");
            System.out.println(page.getTitleText());
            System.out.println(page.asXml());
            System.out.println(page.asText());
        }
    }
}
