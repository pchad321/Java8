package com.zyj.java8;

import java.util.function.Function;

public class FunctionTest2 {

    public static void main(String[] args) {
        FunctionTest2 test = new FunctionTest2();
        System.out.println(test.compute(Integer.MAX_VALUE, value -> value * 2, value -> value + 3));
        System.out.println(test.compute2(Integer.MAX_VALUE, value -> value * 2, value -> value + 3));
    }

    public int compute(int a, Function<Integer, Integer> func1, Function<Integer, Integer> func2) {
        return func1.compose(func2).apply(a);
    }

    public int compute2(int a, Function<Integer, Integer> func1, Function<Integer, Integer> func2) {
        return func1.andThen(func2).apply(a);
    }
}
