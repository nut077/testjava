package com.nut.test.thread;

import java.util.ArrayList;

public class Problems {
    public static void main(String[] args) {
        Counter counter = new Counter();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Thread t1 = new Thread(counter::add);
            Thread t2 = new Thread(counter::sub);
            t1.start();
            t2.start();
            threads.add(t1);
            threads.add(t2);
        }

        threads.forEach(
            thread -> {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        );
        System.out.println(counter.getX());
        for (int i = 0; i < 1_0; i++) {
            System.out.println(i);
        }
    }
}
