package filehandlingtest;

import static org.junit.jupiter.api.Assertions.*;

import filehandling.ReadandWriteTextFile_01;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;

class ReadWriteFile_Test_01 {
    private static final String TEST_INPUT = "test_input.txt";
    private static final String TEST_OUTPUT = "test_output.txt";

    @BeforeEach
    void setUp() throws IOException {
        Files.write(Paths.get(TEST_INPUT), "This is a test content.".getBytes());
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_INPUT));
        Files.deleteIfExists(Paths.get(TEST_OUTPUT));
    }

    @Test
    void testFileCopy() throws IOException {
        ReadandWriteTextFile_01.readWriteFile(TEST_INPUT, TEST_OUTPUT);
        assertTrue(Files.exists(Paths.get(TEST_OUTPUT)), "Output file was not created!");
        assertArrayEquals(Files.readAllBytes(Paths.get(TEST_INPUT)), Files.readAllBytes(Paths.get(TEST_OUTPUT)), "File contents do not match!");
    }

}
