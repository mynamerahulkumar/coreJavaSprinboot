package com.corejava.corejavasprinboot.oops;

/**
 * Interfaces define a contract that classes must implement.
 *
 */
interface  Animal1{
    void eat();
    void sleep();
}
class Cat implements Animal1{

    @Override
    public void eat() {
        System.out.println("Cat Eat fish..");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps 12 hours a day");
    }
}
public class Interface6 {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.eat();
        cat.sleep();
    }
}
