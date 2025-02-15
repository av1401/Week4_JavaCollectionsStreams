package junittesting.basic;

import com.junit.basic.Calculator;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 3);
        assertEquals(6, result);
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(6, 3);
        assertEquals(2.0, result);
    }
}
