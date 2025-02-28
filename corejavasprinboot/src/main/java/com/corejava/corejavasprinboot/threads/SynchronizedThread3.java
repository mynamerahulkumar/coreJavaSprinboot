package com.corejava.corejavasprinboot.threads;

/**
 * 3. What is synchronized in Java?
 * Answer:
 *
 * The synchronized keyword prevents multiple threads from accessing the same resource simultaneously, ensuring thread safety.
 *
 * Without synchronized, both threads might interleave output.
 * With synchronized, only one thread accesses the method at a time.
 */

 class  SharedResources{
     public synchronized void printNumber(){
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
//class MyRunnable1 implements  Runnable{
//     private SharedResources resources;
//     public MyRunnable1(SharedResources sharedResources){
//         this.resources=sharedResources;
//     }
//     @Override
//     public  void run(){
//         resources.printNumber();
//     }
//}
public class SynchronizedThread3 {
    public static void main(String[] args) {
        SharedResources sharedResources=new SharedResources();
        Thread t1=new Thread(()->sharedResources.printNumber(),"Thread-1");
        Thread t2=new Thread(()->sharedResources.printNumber(),"Thread-2");
        t1.start();
        t2.start();
    }


//     Thread t1=new Thread(()->sharedResources.printNumber(),"Thread-1");
}
