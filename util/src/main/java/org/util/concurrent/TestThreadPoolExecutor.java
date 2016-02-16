package org.util.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThreadPoolExecutor
{
    public static void main(String[] args)
    {
        /*
         * corePoolSize：池中所保存的线程数，包括空闲线程（非最大同时干活的线程数）。
         *      如果池中线程数多于corePoolSize，则这些多出的线程在空闲时间超过 keepAliveTime 时将会终止。
         * maximumPoolSize：线程池中最大线程数 
         * keepAliveTime：线程空闲回收的时间
         * unit：keepAliveTime的单位
         * 
         * workQueue：保存任务的队列，可以如下选择： 
         *  无界队列： new LinkedBlockingQueue<Runnable>();
         *  有界队列： new ArrayBlockingQueue<Runnable>(8);你不想让客户端无限的请求吃光你的CPU和内存吧，那就用有界队列
         * 
         * handler：当提交任务数大于队列size会抛出RejectedExecutionException，可选的值为：
         *  ThreadPoolExecutor.CallerRunsPolicy 等待队列空闲
         *  ThreadPoolExecutor.DiscardPolicy：丢弃要插入队列的任务
         *  ThreadPoolExecutor.DiscardOldestPolicy：删除队头的任务
         *  
         *  关于corePoolSize和maximumPoolSize：
         *  当新任务在方法 execute(java.lang.Runnable) 中提交时，如果运行的线程少于 corePoolSize，
         *  则创建新线程来处理请求（即使存在空闲线程）。如果运行的线程多于 corePoolSize 而少于 maximumPoolSize，
         *  则仅当队列（queue）满时才创建新线程。如果设置的 corePoolSize 和 maximumPoolSize 相同，
         *  则创建了固定大小的线程池。如果将 maximumPoolSize 设置为基本的无界值（如 Integer.MAX_VALUE），则允许池适应任意数量的并发任务
         */
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(5);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 6, 1, TimeUnit.DAYS, queue,
                new ThreadPoolExecutor.AbortPolicy());

        for (int i = 0; i < 20; i++)
        {
            final int index = i;
            executor.execute(new Runnable()
            {
                public void run()
                {
                    try
                    {
                        Thread.sleep(4000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.println(String.format("thread %d finished", index));
                }
            });
        }
        executor.shutdown();
    }
}
