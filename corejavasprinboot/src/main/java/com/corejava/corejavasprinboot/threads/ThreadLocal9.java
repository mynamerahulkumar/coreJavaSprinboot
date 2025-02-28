package com.corejava.corejavasprinboot.threads;

/**
 *  How does ThreadLocal work in Java?
 *  Answer:
 *
 * ThreadLocal provides thread confinement, meaning each thread has its own isolated variable instance.
 * It is useful when multiple threads access shared resources without synchronization.
 *
 *Each thread gets a separate copy of the variable, avoiding synchronization issues.
 */
class  ThreadLocalExample implements Runnable{
    private static ThreadLocal<Integer> threadLocal=ThreadLocal.withInitial(()->0);
    public  void increment(){
        threadLocal.set(threadLocal.get()+1);
    }
    public int getValue(){
        return threadLocal.get();
    }
    public void  run(){
        for(int i=0;i<50;i++){
            this.increment();
            System.out.println(Thread.currentThread().getName()+"- value="+this.getValue());
        }
    }
}
public class ThreadLocal9 {
    public static void main(String[] args) {
        ThreadLocalExample example=new ThreadLocalExample();
        Thread t1=new Thread(new ThreadLocalExample(),"Thread-1");
        Thread t2=new Thread(new ThreadLocalExample(),"Thread-2");
        t1.start();
        t2.start();
    }

}
