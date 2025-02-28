package com.corejava.corejavasprinboot.streams;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        names.parallelStream().forEach(name-> System.out.println(Thread.currentThread().getName()+":"+name));
    }
}
