package com.annotation.basic;

import java.lang.reflect.Method;

public class PerformanceTest {

    @LogExecutionTime
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

