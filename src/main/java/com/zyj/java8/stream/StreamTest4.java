package com.zyj.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest4 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "welcome");
//        String[] strs = stream.toArray(String[]::new);
//        Arrays.asList(strs).forEach(System.out::println);

//        List<String> list = stream.collect(Collectors.toList());
//        List<String> list = stream.collect(() -> new ArrayList<String>(), (theList, item) -> theList.add(item), (list1, list2) -> list1.addAll(list2));
//        List<String> list = stream.collect(LinkedList::new, LinkedList::add, LinkedList::addAll);
//        list.forEach(System.out::println);
//        List<String> list = stream.collect(Collectors.toCollection(ArrayList::new));

        String str = stream.collect(Collectors.joining());
        System.out.println(str);
    }
}
