package com.zyj.java8;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");

        optional.ifPresent(item -> System.out.println(item));
    }
}
