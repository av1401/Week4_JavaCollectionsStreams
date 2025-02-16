package com.annotation.advance;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

class SecureService {

    @RoleAllowed("ADMIN")
    public void adminOnlyTask() {
        System.out.println("Admin task executed!");
    }
}

public class Admin {
    public static void main(String[] args) throws Exception {
        String currentUserRole = "USER"; // Change to "ADMIN" for access

        SecureService service = new SecureService();
        for (Method method : SecureService.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed role = method.getAnnotation(RoleAllowed.class);
                if (!role.value().equals(currentUserRole)) {
                    System.out.println("Access Denied!");
                } else {
                    method.invoke(service);
                }
            }
        }
    }
}


