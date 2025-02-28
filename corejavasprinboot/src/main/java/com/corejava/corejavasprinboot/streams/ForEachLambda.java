package com.corejava.corejavasprinboot.streams;

import java.util.Arrays;
import java.util.List;

public class ForEachLambda {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Alice","Bob","Charlies");
        list.stream()
                .forEach(name-> System.out.println(name));
    }
}
