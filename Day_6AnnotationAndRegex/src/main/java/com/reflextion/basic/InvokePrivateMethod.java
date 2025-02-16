package com.reflextion.basic;

import java.lang.reflect.*;

// Define a class with a private method
class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class InvokePrivateMethod {
    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();

        // Get the private method "multiply"
        Method method = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);

        // Allow access to the private method
        method.setAccessible(true);

        // Invoke the method with parameters
        int result = (int) method.invoke(calc, 5, 3);
        System.out.println("Multiplication Result: " + result);
    }
}

