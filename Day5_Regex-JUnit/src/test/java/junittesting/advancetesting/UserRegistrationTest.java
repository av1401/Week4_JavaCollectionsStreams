package junittesting.advancetesting;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.advance.UserRegistration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    private UserRegistration userRegistration;

    @BeforeEach
    public void setUp() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void testValidRegistration() {
        assertDoesNotThrow(() -> userRegistration.registerUser("validUser", "user@example.com", "Password1"));
    }

    @Test
    public void testInvalidUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            userRegistration.registerUser("inv", "user@example.com", "Password1");
        });
        assertEquals("Invalid username. It must be 5-20 characters long and contain only letters, digits, or underscores.", exception.getMessage());
    }

    @Test
    public void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            userRegistration.registerUser("validUser", "userexample.com", "Password1");
        });
        assertEquals("Invalid email format.", exception.getMessage());
    }

    @Test
    public void testInvalidPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            userRegistration.registerUser("validUser", "user@example.com", "pass");
        });
        assertEquals("Invalid password. It must be at least 8 characters long, contain one uppercase letter, and one digit.", exception.getMessage());
    }
}

