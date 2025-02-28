package com.corejava.corejavasprinboot.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindAnyLambda {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana");

        Optional<String>list=items.stream().filter(name->name.startsWith("b"))
                .findAny();
        System.out.println(list);
    }
}
