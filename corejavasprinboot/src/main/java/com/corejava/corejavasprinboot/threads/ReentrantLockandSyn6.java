package com.corejava.corejavasprinboot.threads;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 6. What is a ReentrantLock and how is it different from synchronized?
 * Answer:
 *
 * ReentrantLock is an explicit lock that provides better control over thread synchronization.
 * It supports tryLock(), lockInterruptibly(), and fair locks, which synchronized does not.
 *
 * ReentrantLock allows more flexibility compared to synchronized.
 *
 */

class  SharedResource{
    private final ReentrantLock lock=new ReentrantLock();
    public void printNumbers(){
        lock.lock();
        try{
            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+"-"+i);
            }
            Thread.sleep(100);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
        finally {
            lock.unlock();
        }
    }
}
public class ReentrantLockandSyn6 {
    public static void main(String[] args) {
        SharedResources sharedResources=new SharedResources();
        Thread t1=new Thread(()->sharedResources.printNumber(),"Thread-1");
        Thread t2=new Thread(()->sharedResources.printNumber(),"Thread-2");
        t1.start();
        t2.start();
    }
}
