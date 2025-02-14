package com;

import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Taking input from the user
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();

            // Performing division
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        }
        // Handling division by zero
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        // Finally block always executes
        finally {
            System.out.println("Operation completed.");
        }
    }
}

