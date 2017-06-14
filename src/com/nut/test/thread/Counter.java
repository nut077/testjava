package com.nut.test.thread;

public class Counter {
    private int x;

    public synchronized void add() {
        x++;
    }

    public synchronized void sub() {
        x--;
    }

    public synchronized int getX() {
        return x;
    }
}
