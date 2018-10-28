package com.zyj.java8.stream2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("tom", "lily", "jim", "kitty");
//        list.stream().sorted(String::compareToIgnoreCase).forEach(System.out::println);
//        Collections.sort(list, (item1, item2) -> item1.length() - item2.length());
//        Collections.sort(list, String::compareTo);
//        Collections.sort(list, Comparator.comparingInt(String::length).reversed());
        //注意这里的明确类型定义
//        Collections.sort(list, Comparator.comparingInt((String item) -> item.length()).reversed());
//        list.sort(Comparator.comparingInt(String::length).reversed());
//        list.sort(Comparator.comparingInt((String item) -> item.length()).reversed());
//        list.sort(Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));
//        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(String::compareToIgnoreCase));
//        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(Comparator.comparing(String::toLowerCase, Comparator.reverseOrder())));
        Collections.sort(list, Comparator.comparingInt(String::length).reversed()
                .thenComparing(Comparator.comparing(String::toLowerCase, Comparator.reverseOrder()))
                .thenComparing(Comparator.reverseOrder()));
        System.out.println(list);
    }
}
