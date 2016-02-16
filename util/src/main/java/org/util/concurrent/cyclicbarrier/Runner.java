package org.util.concurrent.cyclicbarrier;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Runner implements Runnable
{

    private CyclicBarrier barrier;

    private String name;

    public Runner(CyclicBarrier barrier, String name)
    {
        super();
        this.barrier = barrier;
        this.name = name;
    }

    @Override
    public void run()
    {
        try
        {
            Thread.sleep(1000 * (new Random()).nextInt(8));
            System.out.println(name + " 准备OK.");
            barrier.await();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        catch (BrokenBarrierException e)
        {
            e.printStackTrace();
        }
        System.out.println(name + " Go!!");
    }
}
