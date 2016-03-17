package org.util.ioc.di.setter;

import junit.framework.TestCase;

import org.util.ioc.Movie;

public class Test extends TestCase
{

    public void testWithSpring() throws Exception {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("spring.xml");
        MovieListener lister = (MovieListener) ctx.getBean("MovieLister");
        Movie[] movies = lister.moviesDirectedBy("Sergio Leone");
        assertEquals("Once Upon a Time in the West", movies[0].getTitle());
    }

}
