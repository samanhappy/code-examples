package org.util.ioc.di.constructor;

import java.util.List;

import org.util.ioc.Movie;

public class ColonDelimitedMovieFinder implements MovieFinder
{
    String filename;

    public ColonDelimitedMovieFinder(String filename)
    {
        this.filename = filename;
    }

    @Override
    public List<Movie> findAll()
    {
        return null;
    }

}
