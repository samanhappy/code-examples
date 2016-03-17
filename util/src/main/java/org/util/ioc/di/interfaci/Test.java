package org.util.ioc.di.interfaci;

import junit.framework.TestCase;

import org.util.ioc.Movie;

public class Test extends TestCase
{
    public void testIface()
    {
        configureContainer();
        MovieListener lister = (MovieListener) container.lookup("MovieLister");
        Movie[] movies = lister.moviesDirectedBy("Sergio Leone");
        assertEquals("Once Upon a Time in the West", movies[0].getTitle());
    }

    private Container container;

    public void configureContainer()
    {
        container = new Container();
        registerComponents();
        registerInjectors();
        container.start();
    }

    private void registerComponents()
    {
        container.registerComponent("MovieLister", MovieListener.class);
        container.registerComponent("MovieFinder", ColonMovieFinder.class);
    }

    private void registerInjectors()
    {
        container.registerInjector(InjectFinder.class, container.lookup("MovieFinder"));
        container.registerInjector(InjectFinderFilename.class, new FinderFilenameInjector());
    }
}
