package com.junit.advance;

import java.util.regex.Pattern;

public class UserRegistration {

    // Regular expression patterns for validation
    private static final Pattern USERNAME_PATTERN = Pattern.compile("^[a-zA-Z0-9_]{5,20}$");
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("^(?=.*[A-Z])(?=.*\\d).{8,}$");

    // Method to register a user
    public void registerUser(String username, String email, String password) {
        if (username == null || !USERNAME_PATTERN.matcher(username).matches()) {
            throw new IllegalArgumentException("Invalid username. It must be 5-20 characters long and contain only letters, digits, or underscores.");
        }
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            throw new IllegalArgumentException("Invalid email format.");
        }
        if (password == null || !PASSWORD_PATTERN.matcher(password).matches()) {
            throw new IllegalArgumentException("Invalid password. It must be at least 8 characters long, contain one uppercase letter, and one digit.");
        }
        // Registration logic (e.g., saving user to a database) goes here
    }
}

