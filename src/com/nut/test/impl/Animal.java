package com.nut.test.impl;

public abstract class Animal implements MyInterface {
    @Override
    public void doSomething() {
        System.out.println("Animal");
    }

    public abstract void walk();
    public void eat() {
        System.out.println("I'm eating!");
    }

}
