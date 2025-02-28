package com.corejava.corejavasprinboot.solid;

/**
 * OCP states that a class should be open for extension but closed for modification.
 */
class  Rectangle{
    public double length,width;
}
class  AreaCalculator{
    public double calculateArea(Rectangle r){
        return  r.length*r.width;
    }
}

// follow OCP
abstract  class Shape{
    abstract  double calculateArea();
}
class Rectangle1 extends Shape{
    double length,width;
    @Override
    double calculateArea() {
        return length*width;
    }
}
class Circle extends  Shape{
   double radius;
    @Override
    double calculateArea() {
        return Math.PI*radius*radius;
    }
}
public class OpenClosePrinciple2 {
}
