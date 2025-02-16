package com.annotation.exercise;

import java.lang.annotation.*;

// Define a container annotation to hold multiple BugReport annotations
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class) // Allows multiple @BugReport on a method
public @interface BugReport {
    String description();
}

