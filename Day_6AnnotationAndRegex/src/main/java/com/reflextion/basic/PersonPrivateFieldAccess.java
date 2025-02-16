package com.reflextion.basic;

import java.lang.reflect.*;

// Define a class with a private field
class Person {
    private int age = 25;
}

public class PersonPrivateFieldAccess {
    public static void main(String[] args) throws Exception {
        Person p = new Person();

        // Get the private field "age"
        Field ageField = Person.class.getDeclaredField("age");

        // Allow access to the private field
        ageField.setAccessible(true);

        // Get and print the original value
        System.out.println("Original Age: " + ageField.get(p));

        // Modify the field value
        ageField.set(p, 30);
        System.out.println("Modified Age: " + ageField.get(p));
    }
}
