package org.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;

@Async
public class TestFuture
{
    public static Future<String> future1() {
        System.out.println("start future1");
        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("sleep over 1");
        return new AsyncResult<>("1");
    }

    public static Future<String> future2() {
        System.out.println("start future2");
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("sleep over 2");
        return new AsyncResult<>("2");
    }

    public static Future<String> future3() {
        System.out.println("start future3");
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("sleep over 3");
        return new AsyncResult<>("3");
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        Future<String> future1 = future1();
        System.out.println("@@@@@@@@@@@");
        Future<String> future2 = future2();
        System.out.println("############");
        Future<String> future3 = future3();
        System.out.println("-------------");
        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());
    }

}
