package com;

//create Custom Exception
class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}

//Maim class
public class CustomExceptionExample{
    public static void main(String[] args) {

        //check for exception
        try{
            validAge(15); // check whether age is valid or not
            System.out.println("Valid");
        }
        //Handle the exception
        catch (CustomException e){
            System.out.println("Custom Exception Caught : " + e.getMessage());
        }
    }

    //method to check whether age is valid or not
    private static void validAge(int age) throws CustomException{
        if(age < 18){
            throw new CustomException("Not a valid age.");
        }
    }
}