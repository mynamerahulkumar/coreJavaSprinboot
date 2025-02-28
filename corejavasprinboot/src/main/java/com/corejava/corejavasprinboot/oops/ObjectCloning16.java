package com.corejava.corejavasprinboot.oops;

/**
 * Object cloning creates a copy of an object using Cloneable.
 *
 */
class Employee3 implements Cloneable{
    String name;
    Employee3(String name){
        this.name=name;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class ObjectCloning16 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee3 employee=new Employee3("Rahul");
        Employee3 employee2=(Employee3) employee.clone();

        System.out.println(employee.hashCode());
        System.out.printf(String.valueOf(employee2.hashCode()));
    }
}
