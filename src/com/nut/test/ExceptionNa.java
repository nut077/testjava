package com.nut.test;

public class ExceptionNa {
    public static void main(String[] args) {
        try {

            int a = 0;
            if (a == 0) {
                throw new OurExcepton("exception na ja");
            }
            System.out.println(5 / 0);
        } catch (ArithmeticException | OurExcepton e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("eiei");
        }
    }
}

class OurExcepton extends Exception {
    public OurExcepton(String str) {
        super(str);
    }
}
