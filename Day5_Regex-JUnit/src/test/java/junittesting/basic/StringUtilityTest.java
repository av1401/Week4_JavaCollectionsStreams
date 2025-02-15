package junittesting.basic;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.basic.StringUtility;
import org.junit.jupiter.api.Test;

public class StringUtilityTest {

    // Test for reverse method.
    @Test
    public void testReverse() {
        String original = "hello";
        String expected = "olleh";
        assertEquals(expected, StringUtility.reverse(original));
    }

    // Test for isPalindrome method.
    @Test
    public void testIsPalindrome() {
        // "racecar" is a palindrome.
        assertTrue(StringUtility.isPalindrome("racecar"));

        // "hello" is not a palindrome.
        assertFalse(StringUtility.isPalindrome("hello"));
    }

    // Test for toUpperCase method.
    @Test
    public void testToUpperCase() {
        String original = "hello";
        String expected = "HELLO";
        assertEquals(expected, StringUtility.toUpperCase(original));
    }
}
