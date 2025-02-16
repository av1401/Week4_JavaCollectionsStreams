package annotationintermediatetesting;

import com.annotation.basic.LogExecutionTime;
import com.annotation.basic.PerformanceTest;

import java.lang.reflect.Method;

public class ExectionTimeTest {
    public static void main(String[] args) throws Exception {
        PerformanceTest test = new PerformanceTest();
        for (Method method : PerformanceTest.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();
                method.invoke(test);
                long end = System.nanoTime();
                System.out.println("Execution Time of " + method.getName() + ": " + (end - start) / 1_000_000 + " ms");
            }
        }
    }
}

