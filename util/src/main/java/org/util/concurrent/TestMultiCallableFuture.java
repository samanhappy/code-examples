package org.util.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestMultiCallableFuture
{
    public static void main(String[] args) throws InterruptedException, ExecutionException
    {
        System.out.println("start main thread");
        int threadCount = 5;
        final ExecutorService exec = Executors.newFixedThreadPool(threadCount);

        List<Future<Integer>> tasks = new ArrayList<Future<Integer>>();
        for (int i = 0; i < threadCount; i++)
        {
            Callable<Integer> call = new Callable<Integer>()
            {
                public Integer call() throws Exception
                {
                    Thread.sleep(1000);
                    return 1;
                }
            };
            tasks.add(exec.submit(call));
        }
        long total = 0;
        for (Future<Integer> future : tasks)
        {
            total += future.get();
        }
        exec.shutdown();
        System.out.println("total: " + total);
        System.out.println("end main thread");
    }
}
