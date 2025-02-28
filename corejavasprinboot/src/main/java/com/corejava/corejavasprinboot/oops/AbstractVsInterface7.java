package com.corejava.corejavasprinboot.oops;

/**
 * Abstract classes can have constructors and non-abstract methods.
 * Interfaces support multiple inheritance and default methods (Java 8+).
 */
abstract  class Vehicle{
    abstract void start();
    Vehicle(){

    }
    void  stop(){
        System.out.println("Vehicle stopped...");
    }
}
interface Engine{

    void start();
    default void service(){
        System.out.println("Engine services");
    }
    default void mechanic(){
        System.out.println("Mechanic service ");
    }
}
class Car1 extends Vehicle implements Engine{

    @Override
    public void start() {
        System.out.println("Engine started");
    }
}

public class AbstractVsInterface7 {
    public static void main(String[] args) {
        Car1 car=new Car1();
        car.start();
        car.stop();
        car.service();
    }
}
