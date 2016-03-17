package org.util.ioc.di.interfaci;

public class FinderFilenameInjector implements Injector
{
    @Override
    public void inject(Object target)
    {
        ((InjectFinderFilename)target).injectFilename("movies1.txt");
    }
}
