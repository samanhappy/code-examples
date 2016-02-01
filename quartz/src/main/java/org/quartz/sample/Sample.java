package org.quartz.sample;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;
import static org.quartz.JobKey.*;
import static org.quartz.impl.matchers.KeyMatcher.*;  

import java.util.ArrayList;
import java.util.Date;

import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.impl.calendar.HolidayCalendar;
import org.quartz.listeners.SchedulerListenerSupport;

public class Sample
{

    public static void main(String[] args) throws SchedulerException
    {
        
        HolidayCalendar cal = new HolidayCalendar();    
        cal.addExcludedDate(new Date());
        cal.addExcludedDate(new Date()); 
        
        SchedulerFactory schedFact = new org.quartz.impl.StdSchedulerFactory();
        Scheduler sched = schedFact.getScheduler();
        sched.addCalendar("myHolidays", cal, false, false); 
        
        sched.getListenerManager().addSchedulerListener(new SchedulerListenerSupport()
        {
            @Override
            public void jobAdded(JobDetail jobDetail)
            {
                super.jobAdded(jobDetail);
            }
        });
        
        sched.getListenerManager().addJobListener(new MyJobListener(), 
                keyEquals(jobKey("myJobName", "myJobGroup")));
        
        sched.start();
        
        // define the job and tie it to our HelloJob class
        JobDataMap newJobDataMap = new JobDataMap();
        newJobDataMap.put("state", new ArrayList<Date>());
        JobDetail job = newJob(HelloJob.class)
                .withIdentity("myJob", "group1")
                .usingJobData("jobSays", "Hello World!")      
                .usingJobData("myFloatValue", 3.141f)
                .usingJobData(newJobDataMap)
                .build();
       
        // Trigger the job to run now, and then every 40 seconds
        Trigger trigger = newTrigger()
                .withIdentity("myTrigger", "group1")
                .startNow()
                .withSchedule(simpleSchedule()
                        .withIntervalInSeconds(3)
                        .repeatForever()
                        .withMisfireHandlingInstructionNextWithExistingCount())
                .modifiedByCalendar("myHolidays") // but not on holidays
                .build();
        
        // Tell quartz to schedule the job using our trigger
        sched.scheduleJob(job, trigger);
        
    }
}
