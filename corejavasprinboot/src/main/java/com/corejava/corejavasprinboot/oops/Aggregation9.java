package com.corejava.corejavasprinboot.oops;

/**
 * Aggregation is a weak "has-a" relationship where the child can exist independently.
 *
 */
 class Address{
     String city;
     Address(String city){
         this.city=city;
     }
}
class Student{
     String  name;
     Address address;
     Student(String  name,Address address){
         this.name=name;
         this.address=address;
     }
}

public class Aggregation9 {
}
