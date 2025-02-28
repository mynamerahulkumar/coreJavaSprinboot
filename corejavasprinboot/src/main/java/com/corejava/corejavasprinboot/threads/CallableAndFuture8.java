package com.corejava.corejavasprinboot.threads;

import java.util.concurrent.*;

/**
 * 8. What is Callable and Future in Java?
 * Callable<T> allows returning a result from a thread.
 * Future<T> holds the result of an asynchronous computation.
 *
 * Future.get() blocks until the result is available.
 */
public class CallableAndFuture8 {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newSingleThreadExecutor();

        // creating a callable task
        Callable<Integer> task=()->{
            System.out.println(" Task is running by Thread:"+Thread.currentThread().getName());
            Thread.sleep(2000);
            return 42;
        };
        //SUbmit the task to executor and a get a future
        Future<Integer> future=executor.submit(task);
        System.out.println("Doing other works while task run .."+Thread.currentThread().getName());
        try{
            // Get the result from the future (wait id not read)
            Integer result=future.get();
            System.out.println("Future result"+result+" by thread:"+Thread.currentThread().getName());
        }
        catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
        executor.shutdown();

    }
}
