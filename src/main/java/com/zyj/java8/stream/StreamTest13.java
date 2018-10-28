package com.zyj.java8.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {

    public static void main(String[] args) {
        Student student1 = new Student("tom", 100, 20);
        Student student2 = new Student("tom", 90, 21);
        Student student3 = new Student("jim", 95, 19);
        Student student4 = new Student("lily", 95, 20);
        Student student5 = new Student("lucy", 100, 19);

        List<Student> list = Arrays.asList(student1, student2, student3, student4, student5);
        Map<String, List<Student>> map = list.stream().collect(Collectors.groupingBy(Student::getName));
        System.out.println(map);
//        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
//        System.out.println(map);
    }
}
