package com.mapinterface;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static Map<String, Integer> countWordFrequency(String filePath) {
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Normalize text: Convert to lowercase and remove punctuation
                line = line.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "");

                // Split words and count frequency
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) { // Avoid empty words
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return wordCount;
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\abhishek vishwakarma\\Desktop\\Capgemini\\Week4_JavaCollectionsStreams\\Day2_JavaCollectionFrameworks\\src\\main\\java\\com\\mapinterface\\Sample.txt";
        Map<String, Integer> wordFrequency = countWordFrequency(filePath);

        // Print word frequencies
        System.out.println(wordFrequency);
    }
}
