package com.reflextion.intermediate;

import java.lang.annotation.*;
import java.lang.reflect.*;

// Define a custom annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

// Apply annotation to a class
@Author(name = "Abhishek Vishwakarma")
class Book { }

public class RetrieveAnnotation {
    public static void main(String[] args) {
        Class<Book> cls = Book.class;

        // Retrieve annotation
        Author author = cls.getAnnotation(Author.class);

        // Print annotation value if present
        if (author != null) {
            System.out.println("Author: " + author.name());
        }
    }
}

