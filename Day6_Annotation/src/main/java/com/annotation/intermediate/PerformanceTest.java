package com.annotation.intermediate;

import com.annotation.basic.LogExecutionTime;

public class PerformanceTest {

    @com.annotation.basic.LogExecutionTime
    public void fastMethod() {
        System.out.println("Fast method running...");
    }

    @LogExecutionTime
    public void slowMethod() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ignored) {}
        System.out.println("Slow method running...");
    }
}

