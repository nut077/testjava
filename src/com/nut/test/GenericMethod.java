package com.nut.test;

import java.awt.*;

public class GenericMethod {
    public static <T> int countItemOccurences(T[] s, T itemToCount) {
        int count = 0;
        for (T item: s) {
            if (item.equals(itemToCount)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] s = new String[3];
        s[0] = "aaa";
        s[1] = "bbb";
        s[2] = "ccc";

        int cstrings = countItemOccurences(s, "aaa");
        System.out.println(cstrings);

        Color[] c = new Color[4];
        c[0] = new Color(225,0, 0);
        c[1] = new Color(0,225, 0);
        c[2] = new Color(0,225, 0);
        c[3] = new Color(0,0, 225);

        int ccolors = countItemOccurences(c, new Color(0, 225, 0));
        System.out.println(ccolors);

        Integer[] i = new Integer[4];
        i[0] = 5;
        i[1] = 10;
        i[2] = 15;
        i[3] = 5;

        int ci = countItemOccurences(i, 5);
        System.out.println(ci);
    }
}
