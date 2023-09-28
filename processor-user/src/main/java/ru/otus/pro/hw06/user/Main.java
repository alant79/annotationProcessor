package ru.otus.pro.hw06.user;

import ru.otus.pro.hw06.user.TestClassCustomToString;

public class Main {

    public static void main(String[] args) {

        TestClass firstSample = new TestClassCustomToString();
        firstSample.setA(5);
        firstSample.setB("Hello world!");
        System.out.println(firstSample);

    }
}
