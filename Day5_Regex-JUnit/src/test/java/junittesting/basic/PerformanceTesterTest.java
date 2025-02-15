package junittesting.basic;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.basic.PerformanceTester;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

class PerformanceTesterTest {
    private final PerformanceTester longRunningTask = new PerformanceTester();

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Fail if execution exceeds 2 seconds
    void testLongRunningTaskTimeout() {
        longRunningTask.longRunningTask(); // Should fail because it takes 3 seconds
    }

    @Test
    void testLongRunningTaskReturnsCorrectResult() {
        String result = longRunningTask.longRunningTask();
        assertEquals("Task Completed", result, "Method should return 'Task Completed'");
    }
}
