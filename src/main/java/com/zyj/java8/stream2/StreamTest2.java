package com.zyj.java8.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "welcome");
        try (Stream<String> stream = list.stream()) {
            stream.onClose(() -> {
                System.out.println("close1");
                throw new RuntimeException("exception 1");
            }).onClose(() -> {
                System.out.println("close2");
                throw new RuntimeException("exception 2");
            }).forEach(System.out::println);
        }
    }
}
