package com.nut.test;

public class AnonymousClass {
    public static void main(String[] args) {
        ActionAfterClick a = () -> System.out.println("eiei");

        Button b = new Button();
        Button b2 = new Button();
        b2.addAction(() -> System.out.println("eiei 2"));

        b.addAction(a);

        ActionAfterClick2 a2 = (a1, b1) -> a1 + b1;
        System.out.println(b2.addAction(30, 40, a2));

        Formula ee = new TestFormula();
        System.out.println(ee.val(5));

    }
}
interface ActionAfterClick {
    void action();
}
interface ActionAfterClick2 {
    int action(int a, int b);
}
class Button {
    void addAction(ActionAfterClick a) {
        a.action();
    }
    int addAction(int a, int b, ActionAfterClick2 a2) {
        return a2.action(a, b);
    }
}

class TestFormula implements Formula {
    public int val(int a) {
        return a;
    }
}

interface Formula {
    default int val(int a) {
        return a + 1;
    }
}
