package com.reflextion.advance;

import java.lang.reflect.*;

// Class with methods whose execution time we will measure
class PerformanceTest {
    public void slowMethod() throws InterruptedException {
        Thread.sleep(2000); // Simulates a slow method
        System.out.println("Slow method executed.");
    }

    public void fastMethod() {
        System.out.println("Fast method executed.");
    }
}

// Utility class for measuring execution time
class MethodTimer {
    public static void measureExecutionTime(Object obj, String methodName) throws Exception {
        // Get the method dynamically
        Method method = obj.getClass().getMethod(methodName);

        // Record the start time
        long startTime = System.nanoTime();

        // Invoke the method
        method.invoke(obj);

        // Record the end time
        long endTime = System.nanoTime();

        // Calculate and print execution time
        System.out.println("Execution time of " + methodName + ": " + (endTime - startTime) / 1_000_000 + " ms");
    }
}

public class MethodExecutionTiming {
    public static void main(String[] args) throws Exception {
        PerformanceTest test = new PerformanceTest();

        // Measure execution time of methods
        MethodTimer.measureExecutionTime(test, "slowMethod");
        MethodTimer.measureExecutionTime(test, "fastMethod");
    }
}
