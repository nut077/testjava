package com.nut.test.impl;

public class Rock implements NonMovableAcitvityClient {
    @Override
    public void doSomething() {
        System.out.println("do something in rock");
    }

    @Override
    public void doSomething(String str) {
        System.out.println(str);
    }

    @Override
    public void onUseRequested() {
        System.out.println("use request");
    }

    @Override
    public void test() {
        System.out.println("test na");
    }
}
