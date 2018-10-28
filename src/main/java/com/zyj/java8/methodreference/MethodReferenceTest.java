package com.zyj.java8.methodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest {

    public String getString(Supplier<String> supplier) {
        return supplier.get() + "test";
    }

    public String getString2(String str, Function<String, String> function) {
        return function.apply(str);
    }

    public static void main(String[] args) {
        Student student1 = new Student("jim", 100);
        Student student2 = new Student("jimmy", 90);
        Student student3 = new Student("lily", 60);
        Student student4 = new Student("tom", 80);

        List<Student> students = Arrays.asList(student1, student2, student3, student4);

//        students.sort(Student::compareStudentByScore);
//        students.forEach(student -> System.out.println(student.getScore()));
//
//        System.out.println("----------------------");
//
//        students.sort(Student::compareStudentByName);
//        students.forEach(student -> System.out.println(student.getName()));
//
//        System.out.println("----------------------");

        students.sort(Student::compareByScore);
        students.forEach(student -> System.out.println(student.getName()));

        System.out.println("----------------------");

        List<String> cities = Arrays.asList("shanghai", "shenzhen", "guangzhou", "beijing");
        Collections.sort(cities, String::compareToIgnoreCase);
        cities.forEach(System.out::println);

        System.out.println("----------------------");

        MethodReferenceTest methodReferenceTest = new MethodReferenceTest();
        String msg = methodReferenceTest.getString(String::new);
        System.out.println(msg);

        System.out.println("----------------------");

        String result = methodReferenceTest.getString2("hello", String::new);
        System.out.println(result);
    }
}
