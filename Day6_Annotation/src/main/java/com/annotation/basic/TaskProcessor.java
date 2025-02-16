package com.annotation.basic;

import java.lang.annotation.*;

public class TaskProcessor {

    @ImportantMethod
    public void criticalTask() {
        System.out.println("Executing a critical task...");
    }

    @ImportantMethod(level = "MEDIUM")
    public void regularTask() {
        System.out.println("Executing a regular task...");
    }
}
