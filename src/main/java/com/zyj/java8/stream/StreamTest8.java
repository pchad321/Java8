package com.zyj.java8.stream;

import java.util.stream.IntStream;

public class StreamTest8 {
    public static void main(String[] args) {
        IntStream.iterate(0, item -> (item + 1) % 2).distinct().limit(6).forEach(System.out::println);
        IntStream.iterate(0, item -> (item + 1) % 2).limit(6).distinct().forEach(System.out::println);
    }
}
