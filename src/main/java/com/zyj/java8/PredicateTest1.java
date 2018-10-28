package com.zyj.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        PredicateTest1 test = new PredicateTest1();
        test.conditionFilter(list, item -> item % 2 == 0);
        System.out.println("-----------");
        test.conditionFilter(list, item -> true);
        System.out.println("-----------");
        test.conditionFilter2(list, item -> item % 2 == 0, item -> item > 4, item-> item > 7);
    }

    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate) {
        list.forEach(i -> {
            if (predicate.test(i))
                System.out.println(i);
        });
    }

    public void conditionFilter2(List<Integer> list, Predicate<Integer> predicate1, Predicate<Integer> predicate2, Predicate<Integer> predicate3) {
        list.forEach(i -> {
            if (predicate1.and(predicate2).or(predicate3).test(i))
                System.out.println(i);
        });
    }
}
