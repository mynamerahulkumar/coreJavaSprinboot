package com.corejava.corejavasprinboot.oops;

/**
 * Classes act as blueprints, while objects are instances of classes.
 *
 *
 */
class Car{
    String brand;
    int year;
    public void displayInfo(){
        System.out.println(brand+"-"+year);
    }
}

public class ClassObject1 {
    public static void main(String[] args) {
        Car car=new Car();
        car.brand="BMW";
        car.year=2025;
        car.displayInfo();
    }
}
