package com.corejava.corejavasprinboot.oops;

/**
 * Enums define a fixed set of constants.
 *
 */
enum Day{Monday,Tuesday,Wednesday}
public class Enum20 {
    public static void main(String[] args) {
        Day today=Day.Tuesday;
        System.out.println("Today is "+today);
    }
}
