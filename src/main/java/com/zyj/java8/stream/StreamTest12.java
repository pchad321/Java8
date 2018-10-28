package com.zyj.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest12 {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("hello", "welcome");
        List<String> list2 = Arrays.asList("tom", "kitty", "lily");
        List<String> result = list1.stream().flatMap(item -> list2.stream().map(item2 -> item + " " + item2))
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
