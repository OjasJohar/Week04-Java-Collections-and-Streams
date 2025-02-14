package largefilereading;
import filereading.ReadingFileLineByLine_09;
import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ReadingLargeFile_09_Test {

    @Test
    public void testInputFileExists() {
        File inputFile = new File("src/main/java/filereading/input.txt");
        assertTrue(inputFile.exists()); // Check if input file exists
    }

    @Test
    public void testNoExceptionThrown() {
        assertDoesNotThrow(() -> ReadingFileLineByLine_09.main(new String[]{})); // Ensure main runs without errors
    }
}
