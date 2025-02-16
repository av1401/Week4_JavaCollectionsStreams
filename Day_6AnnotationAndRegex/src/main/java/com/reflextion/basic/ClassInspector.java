package com.reflextion.basic;

import java.lang.reflect.*;

public class ClassInspector {
    public static void main(String[] args) throws ClassNotFoundException {
        String className = "java.util.ArrayList";  // Example class
        Class<?> cls = Class.forName(className);

        System.out.println("Methods:");
        for (Method method : cls.getDeclaredMethods()) {
            System.out.println(method.getName());
        }

        System.out.println("\nFields:");
        for (Field field : cls.getDeclaredFields()) {
            System.out.println(field.getName());
        }

        System.out.println("\nConstructors:");
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            System.out.println(constructor);
        }
    }
}
