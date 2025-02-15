package com.regex.extractionproblems;
import java.util.regex.*;

public class ExtractCapitalizedWord {
    public static void main(String[] args) {
        String text = "Hello my name is Abhishek Vishwakarma, and I am owner of this Git Hub repository.";

        // Regular expression for capitalized words
        String regex = "\\b[A-Z][a-z]*\\b";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a matcher object
        Matcher matcher = pattern.matcher(text);
        // Output the result of validation
        while(matcher.find()){
            System.out.println("Capital Word is: " + matcher.group());
        }
    }
}