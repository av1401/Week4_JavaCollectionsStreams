package com.reflextion.advance;
import java.lang.reflect.*;
import java.util.*;

// Define a User class
class User {
    public String name;
    public int age;
}

public class CustomObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();

        // Set field values from the map
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            if (properties.containsKey(field.getName())) {
                field.set(obj, properties.get(field.getName()));
            }
        }
        return obj;
    }

    public static void main(String[] args) throws Exception {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "Ritu");
        data.put("age", 28);

        // Convert map to object
        User user = toObject(User.class, data);
        System.out.println(user.name + ", " + user.age);
    }
}
