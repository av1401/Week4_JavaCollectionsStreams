package com;

import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        String data = "C:\\Users\\abhishek vishwakarma\\Desktop\\Capgemini\\Week4_JavaCollectionsStreams\\Day5_ExceptionHandling\\src\\test\\data";
        try(FileReader fr = new FileReader(data)){
            int i;
            while((i = fr.read()) != -1){
                System.out.print((char) i);
            }
        }
        catch (IOException e){
            System.out.println("File not found");
        }
    }
}
