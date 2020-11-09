package com.company.Lab5;

public class B extends A{
    protected String b = "b";

    public B () {}
    public B (String state) {
        this.b = state;
    }

    @Override
    protected void printState() {
        System.out.println(b);
    }
}
