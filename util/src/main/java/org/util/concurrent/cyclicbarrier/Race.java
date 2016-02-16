package org.util.concurrent.cyclicbarrier;

import java.io.IOException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Race
{
    /*
     * 每个线程代表一个跑步运动员，当运动员都准备好后，才一起出发，只要有一个人没有准备好，大家都等待
     */
    public static void main(String[] args) throws IOException, InterruptedException
    {
        CyclicBarrier barrier = new CyclicBarrier(3);

        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.submit(new Thread(new Runner(barrier, "zhangsan")));
        executor.submit(new Thread(new Runner(barrier, "lisi")));
        executor.submit(new Thread(new Runner(barrier, "wangwu")));

        executor.shutdown();
    }
}
