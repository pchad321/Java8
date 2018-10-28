package com.zyj.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class FunctionTest3 {

    public static void main(String[] args) {
        Person person1 = new Person("Jim", 18);
        Person person2 = new Person("Tomm", 28);
        Person person3 = new Person("Henry", 23);
        List<Person> persons = Arrays.asList(person1, person2, person3);
        FunctionTest3 test = new FunctionTest3();
//        List<Person> result = test.getPersonsByAge(20, persons);
//        result.forEach(person -> System.out.println(person.getName() + "---" + person.getAge()));

        List<Person> result2 = test.getPersonByAge2(20, persons, (personAge, personList)->personList.stream().filter(person -> person.getAge() > 20).collect(Collectors.toList()));
        result2.forEach(person -> System.out.println(person.getName() + "===" + person.getAge()));
    }

    public List<Person> getPersonsByAge(int age, List<Person> persons) {
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (personAge, personList) -> personList.stream().filter(person -> person.getAge() > personAge).collect(Collectors.toList());
        return biFunction.apply(age, persons);
    }

    public List<Person> getPersonByAge2(int age, List<Person> persons, BiFunction<Integer, List<Person>, List<Person>> biFunction) {
        return biFunction.apply(age, persons);
    }
}
