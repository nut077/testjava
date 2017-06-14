package com.nut.test;

public class GenericType {
    public static void main(String[] args) {
        Box<String> b = new Box<>();
        b.setElement("eiei");
        System.out.println(b.getElement());
        Box<Integer> b2 = new Box<>();
        b2.setElement(5);
        System.out.println(b2.getElement());

        Box<Object> boxOfObjects = new Box<>();

        ProcessingBoxes.processBox(boxOfObjects);
    }
}

class Box<T> {
    private T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}

class ProcessingBoxes {
    static void processBox(Box<?> box) {

    }
}
