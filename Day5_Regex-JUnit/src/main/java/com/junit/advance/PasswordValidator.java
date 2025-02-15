package com.junit.advance;
import java.util.regex.Pattern;

public class PasswordValidator {
    // Regular expression to validate the password
    private static final String PASSWORD_PATTERN =
            "^(?=.*[A-Z])(?=.*\\d).{8,}$";

    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    // Method to validate the password
    public boolean isValid(String password) {
        if (password == null) {
            return false;
        }
        return pattern.matcher(password).matches();
    }
}

