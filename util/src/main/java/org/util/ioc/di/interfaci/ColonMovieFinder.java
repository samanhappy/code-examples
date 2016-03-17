package org.util.ioc.di.interfaci;

import java.util.List;

import org.util.ioc.Movie;

public class ColonMovieFinder implements MovieFinder, InjectFinderFilename, Injector
{
    String filename;

    @Override
    public void injectFilename(String filename)
    {
        this.filename = filename;
    }

    @Override
    public void inject(Object target)
    {
        ((InjectFinder) target).injectFinder(this);
    }

    @Override
    public List<Movie> findAll()
    {
        return null;
    }

}
