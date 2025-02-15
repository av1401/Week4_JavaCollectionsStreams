package junittesting.advancetesting;


import static org.junit.jupiter.api.Assertions.*;

import com.junit.advance.PasswordValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    private PasswordValidator validator;

    @BeforeEach
    public void setUp() {
        validator = new PasswordValidator();
    }

    @Test
    public void testValidPasswords() {
        assertTrue(validator.isValid("Password1"), "Password with uppercase, digit, and 8 characters should be valid.");
        assertTrue(validator.isValid("A1b2C3d4"), "Password with mixed case and digits should be valid.");
        assertTrue(validator.isValid("1234Abcd"), "Password starting with digits and containing uppercase should be valid.");
    }

    @Test
    public void testInvalidPasswords() {
        assertFalse(validator.isValid("password"), "Password without uppercase and digit should be invalid.");
        assertFalse(validator.isValid("PASSWORD"), "Password without lowercase and digit should be invalid.");
        assertFalse(validator.isValid("Passw1"), "Password with less than 8 characters should be invalid.");
        assertFalse(validator.isValid("password1"), "Password without uppercase should be invalid.");
        assertFalse(validator.isValid("PASSWORD1"), "Password without lowercase should be invalid.");
        assertFalse(validator.isValid("Password"), "Password without digit should be invalid.");
        assertFalse(validator.isValid(null), "Null password should be invalid.");
    }
}

