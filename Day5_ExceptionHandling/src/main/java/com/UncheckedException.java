package com;

import java.io.IOException;
import java.util.*;

public class UncheckedException {
    public static void main(String[] args) {
        //Create Scanner object
        Scanner sc = new Scanner(System.in);

        try{
            //Take two input from user
            System.out.print("Provide Divident : ");
            int divident = sc.nextInt();
            System.out.print("Provide Divisor : ");
            int divisor = sc.nextInt();
            //divides the two number
            System.out.println(divident/divisor);
        }
        //catches Arithmetic Exception
        catch (ArithmeticException e){
            System.out.println("Divisibility by Zero is not possible please provide another number.");
        }
        //Catches Input mismatch exception
        catch(InputMismatchException e){
            System.out.println("Please enter valid values, numeric values can not be divisible by non-numeric values.");
        }

    }
}
