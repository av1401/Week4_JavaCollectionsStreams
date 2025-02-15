package com.junit.advance;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {

    // Method to convert date from yyyy-MM-dd to dd-MM-yyyy
    public String formatDate(String inputDate) {
        try {
            // Define the input and output date formats
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            // Parse the input date
            LocalDate date = LocalDate.parse(inputDate, inputFormatter);

            // Format the date to the desired output format
            return date.format(outputFormatter);
        } catch (DateTimeParseException e) {
            // Handle invalid date formats
            throw new IllegalArgumentException("Invalid date format. Please use 'yyyy-MM-dd'.", e);
        }
    }
}
