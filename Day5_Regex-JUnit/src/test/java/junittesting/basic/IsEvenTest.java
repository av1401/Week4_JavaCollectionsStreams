package junittesting.basic;


import static org.junit.jupiter.api.Assertions.assertEquals;

import com.junit.basic.IsEven;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IsEvenTest {

    IsEven evenChecker = new IsEven();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    public void testEvenNumbers(int number) {
        // Verify even numbers return true
        assertEquals(true, evenChecker.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 9})
    public void testOddNumbers(int number) {
        // Verify odd numbers return false
        assertEquals(false, evenChecker.isEven(number));
    }
}
