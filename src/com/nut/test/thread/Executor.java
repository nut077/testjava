package com.nut.test.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

public class Executor {
    public static void main(String[] args) {
        ArrayList<ArrayList<Double>> randomNumLists = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            randomNumLists.add(new ArrayList<>());
        }
        for (ArrayList<Double> nonInit : randomNumLists) {
            for (int j = 0; j < 10000; j++) {
                nonInit.add(Math.random() * 100);
            }
        }

        ArrayList<Callable<ArrayList<Double>>> callables = new ArrayList<>();
        randomNumLists
            .forEach(v -> callables.add(() -> {
                Collections.sort(v);
                return v;
            }));
        ExecutorService service = Executors.newFixedThreadPool(
            Runtime.getRuntime().availableProcessors()
        );

        try {

            List<Future<ArrayList<Double>>> out = service.invokeAll(callables);
            service.shutdown();

            randomNumLists
                .forEach(v -> {
                    double avg = v.stream()
                        .mapToDouble(value -> value)
                        .average()
                        .orElse(0);
                    System.out.println("list's average is: " + avg);
                });
            out.forEach(futureItem -> {
                try {
                    futureItem.get();
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Min = " + (System.currentTimeMillis() - startTime));
    }
}
