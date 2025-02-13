package com.readlinebyline;

import java.io.*;

public class LargeFileReader {
    public static void main(String[] args) {
        // Replace with your file path
        String filePath = "C:\\Users\\abhishek vishwakarma\\Desktop\\Capgemini\\Week4_JavaCollectionsStreams\\Day3_JavaStreams\\src\\main\\java\\com\\readlinebyline\\Original.txt";

        readErrorLines(filePath);
    }

    private static void readErrorLines(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) { // Case-insensitive check
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

