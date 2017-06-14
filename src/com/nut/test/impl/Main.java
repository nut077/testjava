package com.nut.test.impl;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal() {

            @Override
            public void walk() {

            }
        };
        animal.eat();
        animal.test();

        Car car = new Car();

        MyInterface[] items = {
            animal, car
        };

        for (MyInterface item : items) {
            item.doSomething();
        }

        Rock rock = new Rock();
        rock.onUseRequested();

        class CustomClass implements ActivityClient {

            @Override
            public void doSomething() {
                System.out.println("This is intended to make anonymous inner class");
            }

            @Override
            public void doSomething(String str) {
                System.out.println(str);
            }
        }

        AnimateActivityManager manager = new AnimateActivityManager();
        manager.accept(new ActivityClient() {
            @Override
            public void doSomething() {
                System.out.println("inner class");
            }

            @Override
            public void doSomething(String str) {
                System.out.println("inner class str = " + str);
            }
        });
        manager.accept(new CustomClass());
    }
}
