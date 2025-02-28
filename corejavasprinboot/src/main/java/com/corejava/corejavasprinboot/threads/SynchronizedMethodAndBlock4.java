package com.corejava.corejavasprinboot.threads;

/**
 * 4. What is the difference between synchronized method and synchronized block?
 * Answer:
 *
 * Synchronized Method: Locks the entire method.
 * Synchronized Block: Locks only a part of the code, offering better performance.
 *
 * Use synchronized block when you need to synchronize only a portion of the method.
 */

class  Sharedresource{
    public   void printNumbers(){
        System.out.println("Welcome to print number house..."+Thread.currentThread().getName());
        synchronized (this){
            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+"-"+i);
                try{
                    Thread.sleep(100);
                }
                catch (InterruptedException e){
                    System.out.println(e);
                }
            }
        }

    }
}
public class SynchronizedMethodAndBlock4 {
    public static void main(String[] args) {
        Sharedresource resources=new Sharedresource();
        Thread t1=new Thread(()->resources.printNumbers(),"Thread-1");
        Thread t2=new Thread(()->resources.printNumbers(),"Thread-2");
            t1.start();
            t2.start();
    }


}
