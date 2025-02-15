package try_with_resources;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TryWithResourcesTest_05 {

    @Test
    void testReadingFile() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String testFilePath = "src/main/java/try_with_resources/info.txt";
        TryWithResources_05.readingFile(testFilePath);
        String output = outputStream.toString().trim();
        assertFalse(output.isEmpty(), "Output should not be empty");
    }
}
