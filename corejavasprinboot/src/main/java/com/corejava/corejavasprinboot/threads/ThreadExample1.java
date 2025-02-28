package com.corejava.corejavasprinboot.threads;

/**
 * 1. What is the difference between Runnable and Thread in Java?
 * Answer:
 *
 * Runnable is a functional interface that represents a task to
 * be executed by a thread.
 *
 * Thread is a class that provides the capability to
 * create and manage threads.
 *
 * Using Runnable is preferred for better separation
 * of concerns and avoiding unnecessary subclassing.
 */

class MyRunnable implements  Runnable{
    @Override
    public  void run(){
        System.out.println("Thread is running using runnable");
    }
}
class  MyThread extends Thread{
    @Override
    public  void run(){
        System.out.println("Thread is running using Thread class:"+Thread.currentThread().getName());
    }
}
public class ThreadExample1 {

    public static void main(String[] args) {
//        Thread thread=new Thread(new MyRunnable());
//        thread.start();
        System.out.println("Main-method:"+Thread.currentThread().getName());
        MyThread myThread=new MyThread();
        myThread.start();
    }
}
