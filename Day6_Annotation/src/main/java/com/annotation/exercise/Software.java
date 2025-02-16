package com.annotation.exercise;

public class Software {

    @BugReport(description = "NullPointerException occurs when input is null")
    @BugReport(description = "Performance issue when processing large data")
    public void processData() {
        System.out.println("Processing data...");
    }
}
