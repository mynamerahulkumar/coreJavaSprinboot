package com.corejava.corejavasprinboot.oops;

/**
 * The final keyword prevents modification.
 *
 */
class FinalExample{
    final int MAX=100;
    final void display(){
        System.out.println("This cannot be overriden");
    }
}
class ChildFinal extends FinalExample{

}
public class FinalKeyword12 {
    public static void main(String[] args) {
        FinalExample object=new FinalExample();
        FinalExample object2=new FinalExample();

        System.out.println("Max Value:"+object.MAX);
    }
}
