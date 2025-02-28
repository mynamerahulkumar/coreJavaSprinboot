package com.corejava.corejavasprinboot.solid;

public class Rectangle2  extends Shape{
    double length,width;
    @Override
    double calculateArea() {
        return length*width;
    }
}
