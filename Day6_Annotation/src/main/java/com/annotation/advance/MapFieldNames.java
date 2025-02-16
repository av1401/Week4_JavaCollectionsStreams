package com.annotation.advance;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}
class User {

    @JsonField(name = "user_name")
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String toJson() throws IllegalAccessException {
        Map<String, String> jsonMap = new HashMap<>();
        for (Field field : getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                jsonMap.put(field.getAnnotation(JsonField.class).name(), (String) field.get(this));
            }
        }
        return jsonMap.toString();
    }
}
public class MapFieldNames {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User("Abhishek");
        System.out.println(user.toJson()); // Output: { "user_name": "JohnDoe" }
    }
}

