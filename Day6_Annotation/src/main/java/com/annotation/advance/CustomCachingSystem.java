package com.annotation.advance;

import java.lang.annotation.*;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

class Calculator {
    private static final Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    public int computeSquare(int number) {
        if (cache.containsKey(number)) {
            System.out.println("Returning cached result...");
            return cache.get(number);
        }
        int result = number * number;
        cache.put(number, result);
        return result;
    }
}
public class CustomCachingSystem {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.computeSquare(4)); // Computes
        System.out.println(calc.computeSquare(4)); // Uses Cache
    }
}
