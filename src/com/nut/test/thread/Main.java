package com.nut.test.thread;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Double>> randomNumLists = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomNumLists.add(new ArrayList<>());
        }

        for (ArrayList<Double> nonInit : randomNumLists) {
            for (int j = 0; j < 1000; j++) {
                nonInit.add(Math.random() * 100);
            }
        }
        ArrayList<Thread> joinedThreads = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        int listNum = 0;
        for (ArrayList<Double> arrayList: randomNumLists) {
            System.out.println("Firing new thread");
            final int index = listNum;
            Thread t = new Thread(() -> {
                Collections.sort(arrayList);
                System.out.println("Finish sorting list number: " + index);
            });
            t.start();
            joinedThreads.add(t);
            listNum++;
        }
        for (Thread thread : joinedThreads) {
            try {
                System.out.println("Wait for thread to finish");
                thread.join();
                System.out.println("Thread finished executing");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Min = " + (System.currentTimeMillis() - startTime));
    }
}