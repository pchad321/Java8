package com.zyj.java8.stream;

import java.util.stream.IntStream;

public class StreamTest2 {
    public static void main(String[] args) {
        IntStream.range(1, 9).forEach(System.out::println);
        System.out.println("----------------------------");
        IntStream.rangeClosed(1, 9).forEach(System.out::println);
    }
}
