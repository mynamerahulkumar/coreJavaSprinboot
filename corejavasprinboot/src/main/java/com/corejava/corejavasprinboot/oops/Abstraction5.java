package com.corejava.corejavasprinboot.oops;

/**
 * Abstraction hides the implementation details and exposes only functionality.
 *
 */
abstract class Shape{
    abstract void draw();
}
class  Circle extends Shape{

    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}
public class Abstraction5 {
    public static void main(String[] args) {
        Shape shape=new Circle();
        shape.draw();
    }
}
