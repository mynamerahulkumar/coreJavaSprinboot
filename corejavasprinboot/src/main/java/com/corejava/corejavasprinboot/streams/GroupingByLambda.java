package com.corejava.corejavasprinboot.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByLambda {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        Map<String,Long> map=items.stream()
                .collect(Collectors.groupingBy(item->item,Collectors.counting()));
        System.out.println(map);


    }
}
