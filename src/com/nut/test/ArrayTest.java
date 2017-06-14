package com.nut.test;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] a = new int[4];
        a[0] = 20;
        a[1] = 30;
        a[2] = 2;
        a[3] = 4;
        for (int val : a) {
            System.out.println(val);
        }
        Arrays.sort(a);
        for (int val : a) {
            System.out.println(val);
        }
        String[] name = {"aaaa", "bbbb", "ccc"};
        for (String val : name) {
            System.out.println(val);
        }

        test();
    }

    private static void test() {
        int val = 1;
        switch (val) {
            case 1:
                System.out.println("Orange");
                break;
            case 2:
                System.out.println("Pear");
                break;
            default:
                System.out.println("Apples!");
                break;
        }

    }
}
