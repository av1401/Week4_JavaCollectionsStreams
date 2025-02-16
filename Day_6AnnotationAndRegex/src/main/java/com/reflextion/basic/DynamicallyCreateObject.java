package com.reflextion.basic;

import java.lang.reflect.*;

// Define a simple Student class
class Student {
    public void display() {
        System.out.println("Student object created!");
    }
}

public class DynamicallyCreateObject {
    public static void main(String[] args) throws Exception {
        // Load the Student class dynamically
        Class<?> cls = Class.forName("com.reflextion.basic.Student");


        // Create an instance dynamically (without 'new' keyword)
        Object obj = cls.getDeclaredConstructor().newInstance();

        // Invoke the display method using reflection
        Method method = cls.getMethod("display");
        method.invoke(obj);
    }
}
