package com.nut.test.collectors;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        class Person {
            public int age;
            public String name;

            public Person(int age, String name) {
                this.age = age;
                this.name = name;
            }

            @Override
            public String toString() {
                return name;
            }
        }
        Person[] peopleArr = {
            new Person(10, "aaa"),
            new Person(20, "bbb"),
            new Person(20, "eiei"),
            new Person(30, "ccc")
        };
        ArrayList<Person> people = new ArrayList<>(Arrays.asList(peopleArr));
        Map<Integer, List<Person>> groupPeople = people.stream()
            .filter(person -> person.age <= 20)
            .collect(Collectors.groupingBy(o -> o.age));
        System.out.println(groupPeople.toString());
    }
}
