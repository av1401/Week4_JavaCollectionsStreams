package com.reflextion.intermediate;

import java.lang.reflect.*;

// Define a class with a private static field
class Configuration {
    private static String API_KEY = "OLD_KEY";
}

public class ModifyStatic {
    public static void main(String[] args) throws Exception {
        // Get the private static field
        Field field = Configuration.class.getDeclaredField("API_KEY");
        field.setAccessible(true);

        // Print the old value
        System.out.println("Old API_KEY: " + field.get(null));

        // Modify the field value
        field.set(null, "NEW_KEY");

        // Print the new value
        System.out.println("New API_KEY: " + field.get(null));
    }
}

