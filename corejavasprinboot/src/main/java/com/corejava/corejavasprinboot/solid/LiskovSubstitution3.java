package com.corejava.corejavasprinboot.solid;

/**
 * LSP states that subclasses should be substitutable for their base classes without affecting correctness.
 */

//violates the LSP

class  Rectangle3{
    protected int width,height;
    public  void setWidth(int width){
        this.width=width;
    }
    public void setHeight(int height){
        this.height=height;
    }
}
class  Square extends Rectangle3{
    public void setWidth(int width){
        super.setWidth(width);
        super.setHeight(width);// this  violates LSP
    }
    public void setHeight(int height){
        super.setHeight(height);
        super.setWidth(height);
    }
}
/// / correcting LSP

abstract  class  Shape1{
    abstract  int area();
}
class CorrectRectangle extends Shape1{
    int width,height;

    @Override
    int area(){
        return  width*height;
    }
}
class CorrectSquare extends  Shape1{
    int side;
    @Override
    int area() {
        return side*side;
    }
}
public class LiskovSubstitution3 {
}
