package junit_test.basic_junit_test.testing_file_handling_methods;

import junit.basic_junit_test.testing_file_handling_methods.FileProcessor_08;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class TestingFileProcessor_08 {
    private static final String TEST_FILE = "testfile.txt";
    private FileProcessor_08 fileProcessor;

    @BeforeEach
    void setUp() {
        fileProcessor = new FileProcessor_08();
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello, World!";
        fileProcessor.writeToFile(TEST_FILE, content);
        String readContent = fileProcessor.readFromFile(TEST_FILE);
        assertEquals(content, readContent);
    }

    @Test
    void testFileExistsAfterWrite() throws IOException {
        fileProcessor.writeToFile(TEST_FILE, "Sample Text");
        assertTrue(Files.exists(Paths.get(TEST_FILE)));
    }

    @Test
    void testReadNonExistentFileThrowsException() {
        assertThrows(IOException.class, () -> fileProcessor.readFromFile("nonexistent.txt"));
    }
}
