package com.nut.test.list;

public class OracleArrayList<T> {
    private T[] items;
    private int line;

    public OracleArrayList() {
        items = (T[]) new Object[10];
    }

    @SuppressWarnings("unchecked")
    public void add(T item) {
        if (line < items.length) {
            items[line] = item;
            line++;
        } else {
            T[] copy = items;
            items = (T[]) new Object[items.length + 10];
            System.arraycopy(copy, 0, items, 0, copy.length);
            add(item);
        }
    }

    public T get(int index) {
        return items[index];
    }

    public int size() {
        return items.length;
    }
}
