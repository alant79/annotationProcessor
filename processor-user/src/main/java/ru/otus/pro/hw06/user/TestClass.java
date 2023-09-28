package ru.otus.pro.hw06.user;

import ru.otus.pro.hw06.annotationProcessor.CustomToString;

@CustomToString
public class TestClass {
    protected int a;
    protected String b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }
}
