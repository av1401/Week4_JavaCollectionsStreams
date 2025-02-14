package com;

import java.util.*;

public class NestedTry {
    public static void main(String[] args) {
        try{
            //Create a scanner class
            Scanner sc = new Scanner(System.in);

            //Take an array and Divisor as input
            System.out.print("Enter the lenght of array : ");
            int n = sc.nextInt(); // length of array
            int[] arr = new int[n];
            for(int i =0 ; i< n; i++){
                arr[i] = sc.nextInt();
            }


            //Nested try block
            try {
                System.out.print("Enter Divisor : ");
                int divisor = sc.nextInt();

                System.out.print("Enter Index to be divided : ");
                int index = sc.nextInt();
                //may give array out of bounds or arithmetic exception
                System.out.println(arr[index] / divisor);
            }catch(ArithmeticException e){
                System.out.println("Arithmetic Exception : Cannot divide by zero");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds.");
        }
    }
}
