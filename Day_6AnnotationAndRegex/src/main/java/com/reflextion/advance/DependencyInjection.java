package com.reflextion.advance;
import java.lang.annotation.*;
import java.lang.reflect.*;

// Define an annotation for dependency injection
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}

// Service class that will be injected
class DatabaseService {
    public void connect() {
        System.out.println("Connected to Database!");
    }
}

// Class that needs dependency injection
class Application {
    @Inject
    private DatabaseService databaseService;

    public void start() {
        databaseService.connect();
        System.out.println("Application Started!");
    }
}

// Dependency Injection Container
class DependencyInjector {
    public static void injectDependencies(Object obj) throws Exception {
        // Get all declared fields in the class
        for (Field field : obj.getClass().getDeclaredFields()) {
            // Check if field is annotated with @Inject
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true); // Allow private field access
                Object dependency = field.getType().getDeclaredConstructor().newInstance(); // Create an instance
                field.set(obj, dependency); // Inject the dependency
            }
        }
    }
}

public class DependencyInjection {
    public static void main(String[] args) throws Exception {
        Application app = new Application();

        // Inject dependencies before using the object
        DependencyInjector.injectDependencies(app);

        // Run the application
        app.start();
    }
}

