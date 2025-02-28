package com.corejava.corejavasprinboot.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 7. What is ThreadPoolExecutor and why use it?
 * Answer:
 *
 * ThreadPoolExecutor allows efficient management of a pool of threads.
 * It avoids creating too many threads and improves performance.
 *
 * Advantages:
 * Reuses threads, reducing overhead.
 * Manages thread lifecycle automatically.
 */
public class ThreadPoolExectuor7 {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(3);
        for(int i=1;i<=5;i++){
            final int task=i;
            executor.submit(()-> System.out.println("Executing task "+task+" by "+Thread.currentThread().getName()));


        }
    }
}
