package com.corejava.corejavasprinboot.oops;

/**
 * Encapsulation protects data by keeping it private and providing getters and setters.
 *
 */
class  Employee{
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
public class Encapsulations4 {
    public static void main(String[] args) {
        Employee employe=new Employee();
        employe.setAge(20);
        employe.setName("John");
        System.out.println(employe.getAge());
        System.out.println(employe.getName());
    }
}
