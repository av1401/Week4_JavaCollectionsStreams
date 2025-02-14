package com;

public class ThrowVsThrows {
    //method that will create exception
    public static void calculateInterest(double amount, double rate, int years) throws IllegalArgumentException{
        if(amount <=0 || rate<= 0 || years <= 0){
            throw new IllegalArgumentException("Invalid input: Amount, rate and, years must be positive");
        }
        System.out.println("Calculated Intrest : " + (amount*rate*years) / 100);
    }
    public static void main(String[] args) {
        try{
            calculateInterest(10000,-17,2);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
