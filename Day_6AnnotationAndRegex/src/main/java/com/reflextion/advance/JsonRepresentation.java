package com.reflextion.advance;
import java.lang.reflect.*;
import java.util.*;

// Define an Employee class
class Employee {
    public String name = "Bob";
    public int salary = 5000;
}

public class JsonRepresentation {
    public static String toJson(Object obj) throws Exception {
        StringBuilder json = new StringBuilder("{");

        // Convert object fields to JSON format
        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            json.append("\"").append(field.getName()).append("\":\"")
                    .append(field.get(obj)).append("\",");
        }

        json.setLength(json.length() - 1); // Remove last comma
        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) throws Exception {
        Employee emp = new Employee();
        System.out.println(toJson(emp));
    }
}

