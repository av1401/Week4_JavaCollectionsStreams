package com.ReadFromConsol;

import java.io.*;

public class UserInfoToFile {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\abhishek vishwakarma\\Desktop\\Capgemini\\Week4_JavaCollectionsStreams\\Day3_JavaStreams\\src\\main\\java\\com\\ReadFromConsol\\UserInformation.txt";  // Output file

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(fileName, true)) {  // Append mode

            // Read user input
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // Write to file
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");
            writer.write("-------------------------\n");

            System.out.println("User data saved successfully in " + fileName);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
