package com.corejava.corejavasprinboot.oops;

import java.io.*;

/**
 * Serialization converts objects into byte streams for storage.
 *
 */
class Employee2 implements Serializable{
    String name;
    Employee2(String name){
        this.name=name;
    }
}
public class Serialization15 {
    public static void main(String[] args) {
        Employee2 employee2=new Employee2("Rahul");
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("employee.ser"))){
            oos.writeObject(employee2);
            System.out.println("Object serilized");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
