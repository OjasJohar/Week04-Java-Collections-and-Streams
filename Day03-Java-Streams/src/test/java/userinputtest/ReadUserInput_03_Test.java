package userinputtest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import userinput.ReadUserInputFromConsole_03;

import java.io.*;
import java.nio.file.*;

class ReadUserInput_03_Test {
    private static final String TEST_OUTPUT_FILE = "src\\main\\java\\userinput\\user_data.txt";

    @BeforeEach
    void setUp() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_OUTPUT_FILE));
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_OUTPUT_FILE));
    }

    @Test
    void testUserInputAndFileWrite() throws IOException {

        String simulatedInput = "Alice\n25\nJava\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));


        ReadUserInputFromConsole_03.main(new String[]{});


        assertTrue(Files.exists(Paths.get(TEST_OUTPUT_FILE)), "Output file was not created!");
        String fileContent = Files.readString(Paths.get(TEST_OUTPUT_FILE));
        assertTrue(fileContent.contains("Name: Alice"));
        assertTrue(fileContent.contains("Age: 25"));
        assertTrue(fileContent.contains("Favorite Language: Java"));
    }
}