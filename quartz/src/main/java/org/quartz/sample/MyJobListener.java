package org.quartz.sample;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.listeners.JobListenerSupport;

public class MyJobListener extends JobListenerSupport
{

    @Override
    public String getName()
    {
        return null;
    }
    
    @Override
    public void jobWasExecuted(JobExecutionContext context, JobExecutionException jobException)
    {
        super.jobWasExecuted(context, jobException);
    }

}
