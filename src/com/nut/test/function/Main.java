package com.nut.test.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(2, 1, 3, 4, 5, 6, 7, 8, 9, 10));
        arr
            .stream()
            .filter(integer -> integer < 5)
            .sorted(Comparator.reverseOrder())
            .forEach(System.out::println);
    }

}




