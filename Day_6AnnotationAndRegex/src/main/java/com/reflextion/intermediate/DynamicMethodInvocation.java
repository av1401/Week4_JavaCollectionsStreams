package com.reflextion.intermediate;

import java.lang.reflect.*;

// Define a class with multiple public methods
class MathOperations {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
}

public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        MathOperations math = new MathOperations();

        // Dynamically get the "add" method
        Method method = MathOperations.class.getMethod("add", int.class, int.class);

        // Invoke the method
        int result = (int) method.invoke(math, 10, 5);
        System.out.println("Result: " + result);
    }
}

