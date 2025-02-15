package com.junit.basic;

public class Calculator {

    public int add(int a, int b) {
        return a + b; //add
    }

    public int subtract(int a, int b) {
        return a - b; // subtract
    }

    public int multiply(int a, int b) {
        return a * b; //multiplies
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a/b; //divides
    }
}
