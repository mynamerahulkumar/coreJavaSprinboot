package com.corejava.corejavasprinboot.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterLambdaEg {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> filteredList=list.stream()
                .filter(name->name.length()>3)
                .collect(Collectors.toList());
        System.out.println(filteredList);


    }
}
