package com;

import java.io.*;

public class TryWithResource {
    public static void main(String[] args) {
        // Try-with-resources ensures file is automatically closed
        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {
            String firstLine = br.readLine(); // Read the first line
            if (firstLine != null) {
                System.out.println(firstLine);
            } else {
                System.out.println("File is empty.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

