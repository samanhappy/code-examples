package org.util.ioc.di.constructor;

import junit.framework.TestCase;

import org.util.ioc.Movie;

public class Test extends TestCase
{

    private MutablePicoContainer configureContainer()
    {
        MutablePicoContainer pico = new DefaultPicoContainer();
        Parameter[] finderParams = {new ConstantParameter("movies1.txt")};
        pico.registerComponentImplementation(MovieFinder.class, ColonDelimitedMovieFinder.class, finderParams);
        pico.registerComponentImplementation(MovieListener.class);
        return pico;
    }

    public void testWithPico()
    {
        MutablePicoContainer pico = configureContainer();
        MovieListener lister = (MovieListener) pico.getComponentInstance(MovieListener.class);
        Movie[] movies = lister.moviesDirectedBy("Sergio Leone");
        assertEquals("Once Upon a Time in the West", movies[0].getTitle());
    }

}
