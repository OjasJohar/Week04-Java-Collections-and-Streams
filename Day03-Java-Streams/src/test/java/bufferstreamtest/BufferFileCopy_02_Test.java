package bufferstreamtest;

import static org.junit.jupiter.api.Assertions.*;

import bufferedstreams.BufferedFileCopy_02;
import org.junit.jupiter.api.*;

import java.io.*;
import java.nio.file.*;

class BufferFileCopy_02_Test {
    private static final String testSource = "test_source.txt";
    private static final String testDestBuffered = "testDestBuffered.txt";
    private static final String testDestUnBuffered = "testDestUnBuffered.txt";

    @BeforeEach
    void setUp() throws IOException {
        Files.write(Paths.get(testSource), "This is a test file.".getBytes());
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Paths.get(testSource));
        Files.deleteIfExists(Paths.get(testDestBuffered));
        Files.deleteIfExists(Paths.get(testDestUnBuffered));
    }

    @Test
    void test1() throws IOException {
        BufferedFileCopy_02.copyWithBufferedStreams(testSource, testDestBuffered);
        assertTrue(Files.exists(Paths.get(testDestBuffered)), "Buffered copy failed!");
        assertArrayEquals(Files.readAllBytes(Paths.get(testSource)), Files.readAllBytes(Paths.get(testDestBuffered)), "File contents differ!");
    }

    @Test
    void test2() throws IOException {
        BufferedFileCopy_02.copyWithUnbufferedStreams(testSource, testDestUnBuffered);
        assertTrue(Files.exists(Paths.get(testDestUnBuffered)), "Unbuffered copy failed!");
        assertArrayEquals(Files.readAllBytes(Paths.get(testSource)), Files.readAllBytes(Paths.get(testDestUnBuffered)), "File contents differ!");
    }
}
