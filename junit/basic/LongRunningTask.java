package com.junit.basic;

public class LongRunningTask {
    public String longRunningTask() {
        try {
            Thread.sleep(3000); // Simulating a long task (3 seconds)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
        }
        return "Task Completed";
    }
}
