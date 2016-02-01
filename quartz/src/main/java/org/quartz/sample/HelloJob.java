package org.quartz.sample;

import java.util.ArrayList;
import java.util.Date;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
import org.quartz.PersistJobDataAfterExecution;

@DisallowConcurrentExecution
@PersistJobDataAfterExecution
public class HelloJob implements Job
{
    String jobSays;

    float myFloatValue;

    ArrayList<Date> state;

    public void execute(JobExecutionContext context) throws JobExecutionException
    {
        JobKey key = context.getJobDetail().getKey();
        state.add(new Date());
        System.err.println("Date list size:" + state.size() + ",Instance " + key + " of DumbJob says: " + jobSays
                + ", and val is: " + myFloatValue);

        JobDataMap dataMap = context.getJobDetail().getJobDataMap();
        dataMap.put("myFloatValue", 1 + myFloatValue);
    }

    public void setJobSays(String jobSays)
    {
        this.jobSays = jobSays;
    }

    public void setMyFloatValue(float myFloatValue)
    {
        this.myFloatValue = myFloatValue;
    }

    public void setState(ArrayList<Date> state)
    {
        this.state = state;
    }
}
