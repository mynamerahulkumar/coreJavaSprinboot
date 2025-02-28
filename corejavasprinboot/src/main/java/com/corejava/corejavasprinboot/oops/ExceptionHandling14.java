package com.corejava.corejavasprinboot.oops;

/**
 * Handling exceptions ensures program stability.
 *
 */
public class ExceptionHandling14 {
    public static void main(String[] args) {
        try{
            int result=10/0;
            System.out.println(result);
        }
        catch (ArithmeticException exception){
            System.out.println("Exception caught:"+exception.getMessage());
        }
        finally {
            System.out.println("Resources closed");
        }
        System.out.println("PRint remaining method");

    }
}
