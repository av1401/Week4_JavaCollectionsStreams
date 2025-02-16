package com.annotation.intermediate;

// Define the MaxLength annotation
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

// User class with annotation applied
class User {
    @MaxLength(10)
    private String username;

    public User(String username) {
        if (username.length() > 10) { // Direct validation in constructor
            throw new IllegalArgumentException("Username exceeds maximum length!");
        }
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

// Main class to run the program
public class Users {
    public static void main(String[] args) {
        User user1 = new User("Swayam"); // Works fine
        System.out.println("User 1 Created: " + user1.getUsername());

        User user2 = new User("VeryLongUsername"); // Throws IllegalArgumentException
        System.out.println("User 2 Created: " + user2.getUsername());
    }
}
