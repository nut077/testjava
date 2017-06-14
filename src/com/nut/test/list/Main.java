package com.nut.test.list;

public class Main {
    public static void main(String[] args) {
        OracleArrayList<Double> list = new OracleArrayList<>();
        for (int i = 0; i < 25; i++) {
            list.add(Double.parseDouble(Integer.toString(i)));
        }

        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i));
        }

        OracleHashMap.HashProvider<String> provider = key -> {
            int sum = 0;
            for (int i = 0; i < key.length(); i++) {
                sum += key.charAt(i) * i;
            }
            return sum;
        };
        OracleHashMap<String, Integer> hashMap = new OracleHashMap<String, Integer>(provider);
        hashMap.put("Sally", 100);
        hashMap.put("Willy", 25);
        hashMap.put("Joey", 40);
        int result = hashMap.get("Willy");
        System.out.println(result);
    }
}
