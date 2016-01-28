package org.quartz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DataConversionTask
{
    /** 日志对象 */
    private static final Logger LOG = LoggerFactory.getLogger(DataConversionTask.class);

    public void run()
    {
        if (LOG.isDebugEnabled())
        {
            LOG.debug("数据转换任务线程开始执行");
        }
        if (LOG.isInfoEnabled())
        {
            LOG.info("数据转换任务线程开始执行");
        }
        if (LOG.isErrorEnabled())
        {
            LOG.error("数据转换任务线程开始执行");
        }
        if (LOG.isTraceEnabled())
        {
            LOG.trace("数据转换任务线程开始执行");
        }
        if (LOG.isWarnEnabled())
        {
            LOG.warn("数据转换任务线程开始执行");
        }
    }
    
    public static void main(String[] args)
    {
        new DataConversionTask().run();
    }
}
