package com.corejava.corejavasprinboot.oops;

/**
 * Association represents a "has-a" relationship.
 */
class Department{
    String name;
    Department(String name){
        this.name=name;
    }
}
class Employee1{
    String name;
    Department department;
    Employee1(String name,Department department){
        this.name=name;
        this.department=department;
    }
}
public class Associations8 {
    public static void main(String[] args) {
        Department department=new Department("HR");
        Employee1 employee1=new Employee1("Rahul",department);
        System.out.println(employee1.name+" works in "+employee1.department.name);
    }
}
