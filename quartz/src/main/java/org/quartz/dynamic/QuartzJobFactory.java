package org.quartz.dynamic;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.simple.DataConversionTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 定时任务运行工厂类
 */
public class QuartzJobFactory implements Job
{
    /** 日志对象 */
    private static final Logger LOG = LoggerFactory.getLogger(DataConversionTask.class);

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException
    {
        LOG.info("任务成功运行");
        ScheduleJob scheduleJob = (ScheduleJob) context.getMergedJobDataMap().get("scheduleJob");
        LOG.info("任务名称 = [{}]", scheduleJob.getJobName());
    }
}
