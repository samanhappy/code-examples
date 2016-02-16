package org.util.concurrent;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestNewFixedThreadPool
{
    public static void main(String[] args) throws IOException, InterruptedException
    {
        ExecutorService service = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 4; i++)
        {
            Runnable run = new Runnable()
            {
                @Override
                public void run()
                {
                    try
                    {
                        Thread.sleep(3000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.println("thread start");
                }
            };
            service.execute(run);
        }

        // 用于关闭启动线程，如果不调用该语句，jvm不会关闭
        service.shutdown();
        System.out.println("shut down");

        // 用于等待子线程结束，再继续执行下面的代码
        service.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
        System.out.println("all thread complete");
    }
}
