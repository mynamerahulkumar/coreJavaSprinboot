package com.corejava.corejavasprinboot.streams;

import java.util.stream.IntStream;

public class ReduceWithLambda {
    public static void main(String[] args) {
        int sum= IntStream.range(1,10)
                .reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
