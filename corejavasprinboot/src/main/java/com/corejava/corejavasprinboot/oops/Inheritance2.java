package com.corejava.corejavasprinboot.oops;

/**
 * Inheritance allows one class to inherit properties from another.
 *
 */
class Animal{
    void eat(){
        System.out.println("Animal eat food");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("The dog barks");
    }

}
class Cat1 extends Animal{
    void mew(){

    }
}
class puppy extends Dog{

}
public class Inheritance2 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.bark();
        dog.eat();
    }
}
