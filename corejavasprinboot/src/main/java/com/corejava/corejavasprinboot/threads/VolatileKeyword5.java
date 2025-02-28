package com.corejava.corejavasprinboot.threads;

/**
 * 5. What is volatile in Java?
 * Answer:
 *
 * The volatile keyword ensures that changes to a variable are immediately visible to all threads.
 *
 * Without volatile, the loop might never stop due to CPU caching.
 */
class  SharedData{
    private volatile  boolean flag=true;
    public  void stop(){
        System.out.println("stop thread:"+Thread.currentThread().getName());
        flag=false;
    }
    public void run(){
        while (flag){
            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+"-"+i);
            }
        }
        System.out.println("stopped");
    }
}
public class VolatileKeyword5 {
    public static void main(String[] args) throws InterruptedException {
        SharedData sharedData=new SharedData();
        Thread t1=new Thread(sharedData::run,"Thread-1");
        t1.start();
        Thread.sleep(1000);
        sharedData.stop();

    }

}
