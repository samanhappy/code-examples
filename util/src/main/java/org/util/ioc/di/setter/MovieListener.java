package org.util.ioc.di.setter;

import java.util.Iterator;
import java.util.List;

import org.util.ioc.Movie;

public class MovieListener
{
    private MovieFinder finder;

    public void setFinder(MovieFinder finder)
    {
        this.finder = finder;
    }

    public Movie[] moviesDirectedBy(String arg)
    {
        List<Movie> allMovies = finder.findAll();
        for (Iterator<Movie> it = allMovies.iterator(); it.hasNext();)
        {
            Movie movie = (Movie) it.next();
            if (!movie.getDirector().equals(arg))
                it.remove();
        }
        return (Movie[]) allMovies.toArray(new Movie[allMovies.size()]);
    }
}
