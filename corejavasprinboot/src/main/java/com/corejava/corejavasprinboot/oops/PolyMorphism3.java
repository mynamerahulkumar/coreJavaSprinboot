package com.corejava.corejavasprinboot.oops;

/**
 * Polymorphism allows methods to have the same name but different implementations.1
 */
// compile time(method overloading)
class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}

/**
 * method overriding Run-time
 */
class  Parent{
    void display(){
        System.out.println("Parent display method");
    }
}
class Child extends Parent{

    @Override
    void display(){
        System.out.println("Child display method");
    }
}
public class PolyMorphism3 {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        int sum1=calculator.add(2,3);
        int sum2=calculator.add(4,5,6);
        System.out.println(sum1);
        System.out.println(sum2);
        Child child=new Child();
        child.display();
        Parent parent=new Parent();
        parent.display();
    }
}
