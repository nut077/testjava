package com.nut.test;

import java.security.Principal;

public class ObjectTest {
    String test = "freedom";
    private NestedClass nestedClass;

    public ObjectTest() {
        nestedClass = new NestedClass("eiei");
    }

    public static void main(String[] args) {
        Student student = new Student("Freedom", "1990-05-07");
        //student.printInfo();

        aaa("sss", "aaa", "bbb", "ccc");
        String[] sss = {"sss", "bbb", "ccc", "dddd"};
        bbb(sss);

    }

    public class NestedClass {
        private String val;
        NestedClass(String val) {
            this.val = val;
        }

        public void printInfo() {
            System.out.println(val);
        }
    }

    private static void aaa(String... arr) {
        for (String s : arr) {
            System.out.println(s);
        }
    }

    private static void bbb(String[] arr) {
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
abstract class Person {
    private String username, birthDate;

    public Person(String username, String birthDate) {
        this.username = username;
        this.birthDate = birthDate;
    }

    public abstract void printInfo();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void doSomething() {

    }
}

class Student extends Person {
    public Student(String username, String birthDate) {
        super(username, birthDate);
    }

    @Override
    public void printInfo() {
        System.out.println("I'm a student and i was born on " + getBirthDate());
    }
}


class Teacher {

}

class School {
    private Principal principal;
    private Teacher[] teachers;
    private Student[] students;

    public School() {

    }
}

class Principal2 extends Person {

    public Principal2(String username, String birthDate) {
        super(username, birthDate);
    }

    @Override
    public void printInfo() {
        System.out.println("I'm Principla2");
    }
}
