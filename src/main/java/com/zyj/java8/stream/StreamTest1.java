package com.zyj.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {

    public static void main(String[] args) {
        Stream stream1 = Stream.of("aaa", "bbb", "ccc");

        String[] strs = new String[]{"hello", "world", "welcome"};
        Stream stream2 = Stream.of(strs);
        Stream stream3 = Arrays.stream(strs);

        List<String> list = Arrays.asList("hello", "world", "welcome");
        Stream stream4 = list.stream();
    }
}
