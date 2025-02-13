package com.filehandling;

import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        // Source file name
        String sourceFile = "C:\\Users\\abhishek vishwakarma\\Desktop\\Capgemini\\Week4_JavaCollectionsStreams\\Day3_JavaStreams\\src\\main\\java\\com\\filehandling\\source.txt";
        // Destination file name
        String destinationFile = "C:\\Users\\abhishek vishwakarma\\Desktop\\Capgemini\\Week4_JavaCollectionsStreams\\Day3_JavaStreams\\src\\main\\java\\com\\filehandling\\destination.txt";

        try (FileInputStream inputFile = new FileInputStream(sourceFile);
             FileOutputStream outputFile = new FileOutputStream(destinationFile)) {

            int data;
            while ((data = inputFile.read()) != -1) {  // Read data byte by byte
                outputFile.write(data);  // Write data to destination file
            }

            System.out.println("File copied successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Source file not found.");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred.");
        }
    }
}
