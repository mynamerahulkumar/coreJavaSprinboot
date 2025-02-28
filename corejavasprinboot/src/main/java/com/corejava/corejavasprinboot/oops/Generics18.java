package com.corejava.corejavasprinboot.oops;

/**
 * Generics provide type safety for collections and classes.
 *
 */
class GenericExample<T>{
    private T value;
    public  void setValue(T value){
        this.value=value;
    }
    public T getValue(){
        return value;
    }
}
public class Generics18 {
    public static void main(String[] args) {
        GenericExample<String> example=new GenericExample<>();
        example.setValue("Rahul");
        System.out.println(example.getValue());
        GenericExample<Integer> example2=new GenericExample<>();
        example2.setValue(10);
        System.out.println(example2.getValue());
    }

}
