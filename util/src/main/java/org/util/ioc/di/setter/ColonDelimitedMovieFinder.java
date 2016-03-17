package org.util.ioc.di.setter;

import java.util.List;

import org.util.ioc.Movie;

public class ColonDelimitedMovieFinder implements MovieFinder
{
    String filename;

    public void setFilename(String filename)
    {
        this.filename = filename;
    }

    @Override
    public List<Movie> findAll()
    {
        return null;
    }

}
