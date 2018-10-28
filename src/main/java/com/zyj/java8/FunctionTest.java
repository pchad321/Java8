package com.zyj.java8;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {
        FunctionTest test = new FunctionTest();
        System.out.println(test.convert(5, value -> String.valueOf(value + "hello")));
    }

    public String convert(int a, Function<Integer, String> function) {
        return function.apply(a);
    }
}
