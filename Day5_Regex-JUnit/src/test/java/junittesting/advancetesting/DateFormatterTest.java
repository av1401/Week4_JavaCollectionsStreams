package junittesting.advancetesting;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.advance.DateFormatter;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {

    private final DateFormatter dateFormatter = new DateFormatter();

    @Test
    public void testValidDate() {
        String inputDate = "2023-02-15";
        String expectedOutput = "15-02-2023";
        String actualOutput = dateFormatter.formatDate(inputDate);
        assertEquals(expectedOutput, actualOutput, "The date should be formatted to dd-MM-yyyy.");
    }

    @Test
    public void testInvalidDateFormat() {
        String inputDate = "15/02/2023";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            dateFormatter.formatDate(inputDate);
        });
        assertEquals("Invalid date format. Please use 'yyyy-MM-dd'.", exception.getMessage());
    }

    @Test
    public void testInvalidDateValue() {
        String inputDate = "2023-02-30"; // Invalid date
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            dateFormatter.formatDate(inputDate);
        });
        assertTrue(exception.getMessage().contains("Invalid date format"));
    }

    @Test
    public void testNullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            dateFormatter.formatDate(null);
        });
        assertEquals("Invalid date format. Please use 'yyyy-MM-dd'.", exception.getMessage());
    }
}
