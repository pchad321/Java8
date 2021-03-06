package com.zyj.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello world", "hello tom", "hello kitty", "welcome");
        list.stream().map(item -> item.split(" "))
                .flatMap(Arrays::stream)
                .distinct().collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
