package com.reflextion.advance;

import java.lang.reflect.*;

// Define an interface
interface Greeting {
    void sayHello();
}

// Implementation of the interface
class GreetingImpl implements Greeting {
    public void sayHello() {
        System.out.println("Hello, welcome!");
    }
}

// Dynamic Proxy Handler to log method calls
class LoggingProxyHandler implements InvocationHandler {
    private final Object target;

    // Constructor to accept the real object
    public LoggingProxyHandler(Object target) {
        this.target = target;
    }

    // Intercept method calls
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Logging: Method " + method.getName() + " is called");
        return method.invoke(target, args);
    }
}

public class CustomLoggingProxy {
    public static void main(String[] args) {
        // Create a real object
        Greeting realGreeting = new GreetingImpl();

        // Create a dynamic proxy
        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingProxyHandler(realGreeting)
        );

        // Call method via proxy (it will log before executing)
        proxyInstance.sayHello();
    }
}

