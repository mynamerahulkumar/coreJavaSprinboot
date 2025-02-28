package com.corejava.corejavasprinboot.oops;

/**
 * Static variables and methods belong to the class, not instances.
 *
 */
class Counter{
    static int count=0;
    Counter(){
        count++;
    }
    static void printCount(){
        System.out.println(count);
    }
}
public class Statickeyword11 {
    public static void main(String[] args) {
        Counter counter=new Counter();
        Counter counter1=new Counter();
        System.out.println("Total object created="+Counter.count);
        Counter.printCount();
    }
}
