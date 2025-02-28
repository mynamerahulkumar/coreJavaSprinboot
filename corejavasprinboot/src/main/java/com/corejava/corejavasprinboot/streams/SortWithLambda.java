package com.corejava.corejavasprinboot.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortWithLambda {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Rahul","Kumar","John");
        List<String> sortedList=list.stream()
                .sorted((a,b)->a.compareTo(b))
                .collect(Collectors.toList());
        System.out.println(sortedList);
    }

}
