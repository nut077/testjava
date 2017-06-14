package com.nut.test.impl;

public interface MyInterface {
    void doSomething();
    default void test() {
        System.out.println("test in MyInterface");
    }
}
