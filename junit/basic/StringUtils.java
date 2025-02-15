package com.junit.basic;

public class StringUtils {
    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    public static boolean isPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equalsIgnoreCase(reversed);
    }

    public static String toUpperCase(String input) {
        input = input.toUpperCase();
        return input;
    }
}
