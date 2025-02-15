package junittesting.basic;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.basic.FileProcessor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class FileProcessorTest {
    private final FileProcessor fileProcessor = new FileProcessor();

    // Temporary directory provided by JUnit
    @TempDir
    Path tempDir;

    @Test
    void testWriteAndReadFile() throws IOException {
        Path tempFile = tempDir.resolve("testFile.txt");
        String content = "Hello, JUnit!";

        // Write content to the file
        fileProcessor.writeToFile(tempFile.toString(), content);

        // Read content from the file and verify
        String readContent = fileProcessor.readFromFile(tempFile.toString());
        assertEquals(content, readContent, "The written and read content should match.");
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        Path tempFile = tempDir.resolve("testFile.txt");
        String content = "File existence check.";

        // Write to file
        fileProcessor.writeToFile(tempFile.toString(), content);

        // Verify file exists
        assertTrue(Files.exists(tempFile), "File should exist after writing.");
    }

    @Test
    void testReadFromNonExistentFileThrowsException() {
        Path nonExistentFile = tempDir.resolve("missing.txt");

        // Verify IOException is thrown when reading a non-existent file
        assertThrows(IOException.class, () -> fileProcessor.readFromFile(nonExistentFile.toString()));
    }
}