package com.filterstreams;

import java.io.*;

public class UpperToLowerConverter {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\abhishek vishwakarma\\Desktop\\Capgemini\\Week4_JavaCollectionsStreams\\Day3_JavaStreams\\src\\main\\java\\com\\filterstreams\\Input..txt";   // Source file
        String outputFile = "C:\\Users\\abhishek vishwakarma\\Desktop\\Capgemini\\Week4_JavaCollectionsStreams\\Day3_JavaStreams\\src\\main\\java\\com\\filterstreams\\Output.txt"; // Destination file

        convertFileToLowercase(inputFile, outputFile);
    }

    private static void convertFileToLowercase(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase()); // Convert to lowercase
                writer.newLine(); // Preserve line breaks
            }

            System.out.println("Conversion completed! Check output.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

