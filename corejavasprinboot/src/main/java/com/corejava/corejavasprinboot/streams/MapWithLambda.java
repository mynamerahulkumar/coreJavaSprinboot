package com.corejava.corejavasprinboot.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapWithLambda {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Rahul","Kumar","John");
        List<String> lambdalist=list.stream()
                .map(name->name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(lambdalist);
    }
}
