package com.nut.test;

public class Dog extends Animal {
    @Override
    void eat(String food) {
        System.out.println("dog eat" + food);
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat("boon");
    }
}
