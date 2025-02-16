package com.annotation.basic;

public class Development {

    @Todo(task = "Implement login functionality", assignedTo = "Alice", priority = "HIGH")
    public void loginFeature() {}

    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    public void optimizeDB() {}
}

