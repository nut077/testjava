package com.nut.test.list;

import java.util.ArrayList;

public class OracleHashMap<K, V> {

    public static interface HashProvider<K> {
        int getHash(K key);
    }

    private class Holder<K, V> {
        private K key;
        private V value;

        public Holder(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private ArrayList<Holder<K, V>>[] values;
    private HashProvider<K> provider;

    public OracleHashMap(HashProvider<K> provider) {
        values = (ArrayList<Holder<K, V>>[]) new Object[1000];
        this.provider = provider;
    }

    public void put(K key, V value) {
        boolean didFindItemInBucket = false;
        int index = getHash(key);
        ArrayList<Holder<K, V>> bucket = values[index];
        for (int i = 0; i < bucket.size(); i++) {
            Holder<K, V> item = bucket.get(i);
            if (item.key == key) {
                item.value = value;
                didFindItemInBucket = true;
                break;
            }
        }
        if (!didFindItemInBucket) {
            bucket.add(new Holder<>(key, value));
        }
    }

    public V get(K key) {
        int index = getHash(key);
        ArrayList<Holder<K, V>> bucket = values[index];
        for (int i = 0; i < bucket.size(); i++) {
            Holder<K, V> item = bucket.get(i);
            if (item.key == key) {
                return item.value;
            }
        }
        return null;
    }


    private int getHash(K key) {
        return provider.getHash(key) % values.length;
    }
}
