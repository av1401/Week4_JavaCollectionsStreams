package com;

public class MultipleCatchBlocks{
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[1] / 0; // This will throw ArithmeticException
            System.out.println(numbers[3]); // This will throw ArrayIndexOutOfBoundsException
            String text = null;
            System.out.println(text.length()); // This will throw NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception caught: " + e.getMessage());
        }
        System.out.println("Rest of the code executes...");
    }
}


