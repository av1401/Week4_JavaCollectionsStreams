package com.junit.basic;

public class Divide {
    public int divide(int a, int b) { //method divide for problem 4
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }



}
