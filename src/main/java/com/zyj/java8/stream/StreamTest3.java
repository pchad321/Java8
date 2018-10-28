package com.zyj.java8.stream;

import java.util.stream.IntStream;

public class StreamTest3 {
    public static void main(String[] args) {
        int result = IntStream.rangeClosed(1, 9).map(value -> 2 * value).reduce(0, Integer::sum);
        System.out.println(result);
    }
}
