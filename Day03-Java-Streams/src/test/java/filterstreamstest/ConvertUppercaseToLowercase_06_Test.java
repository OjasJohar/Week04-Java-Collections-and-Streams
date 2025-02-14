package filterstreamstest;
import filterstreams.ConvertUppercaseToLowercase_06;
import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConvertUppercaseToLowercase_06_Test {

    @Test
    public void testOutputFileCreated() {
        ConvertUppercaseToLowercase_06.main(new String[]{});
        File outputFile = new File("src/main/java/filterstreams/output.txt");
        assertTrue(outputFile.exists()); // Check if output file is created
    }

    @Test
    public void testInputFileExists() {
        File inputFile = new File("src/main/java/filterstreams/input.txt");
        assertTrue(inputFile.exists()); // Check if input file exists
    }
}
