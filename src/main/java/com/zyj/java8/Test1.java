package com.zyj.java8;

import java.util.Arrays;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        list.forEach(i -> System.out.println(i));
//        list.forEach(System.out::println);

        list.stream().map(item -> {
            System.out.println("--------");
            return item * 2;
        }).forEach(System.out::println);
    }
}
