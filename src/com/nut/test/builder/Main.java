package com.nut.test.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(
            "Freedom",
            27,
            new Person.Address("237", "Kanchanaburi", "eiei"));

        Person p1 = new Person.Builder()
            .name("Freedom")
            .age(20)
            .address(
                new Person.Address.Builder()
                    .street("237")
                    .city("Kanchanaburi")
                    .state("eiei")
                    .create()
            ).create();

        Person p2 = new Person.Builder()
            .name("Seven")
            .age(20)
            .address(
                new Person.Address.Builder()
                    .street("237")
                    .city("Kanchanaburi")
                    .state("eiei")
                    .create()
            ).create();

        Person p3 = new Person.Builder()
            .name("Eiei")
            .age(20)
            .address(
                new Person.Address.Builder()
                    .street("237")
                    .city("Kanchanaburi")
                    .state("eiei")
                    .create()
            ).create();

        ArrayList<Person> personList = new ArrayList<>(Arrays.asList(p1, p2, p3));
        //personList.forEach(person1 -> System.out.println(person1.getName()));
        String result = personList.stream().filter(person1 -> !person1.getName().equals("Freedom"))
            .map(Person::getName)
            .collect(Collectors.joining());

        //System.out.println(result);

        BiPredicate<Integer, Person> test = (Integer i, Person p) -> p.getAge() < 10;
        if (test.test(1, p1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
