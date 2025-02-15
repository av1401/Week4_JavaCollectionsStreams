package com.junit.basic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileProcessor {

    // Method to write content to a file
    public void writeToFile(String filename, String content) throws IOException {
        Path filePath = Path.of(filename);
        Files.writeString(filePath, content, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    // Method to read content from a file
    public String readFromFile(String filename) throws IOException {
        Path filePath = Path.of(filename);
        return Files.readString(filePath);
    }
}
