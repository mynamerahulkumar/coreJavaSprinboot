package com.corejava.corejavasprinboot.oops;

/**
 * Inner classes are defined within another class.
 *
 */
class Outer{
    class Inner{
        void display(){
            System.out.println("Inner class method");
        }
    }
}
public class InnerClasses17 {
    public static void main(String[] args) {
        Outer.Inner inner=new Outer().new Inner();
        inner.display();

    }
}
