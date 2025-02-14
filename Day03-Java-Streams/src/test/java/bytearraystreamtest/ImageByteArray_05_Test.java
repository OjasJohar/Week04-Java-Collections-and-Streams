package bytearraystreamtest;

import bytearraystream.ImageByteArray_05;
import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ImageByteArray_05_Test {

    @Test
    public void testImageCopy() {
        ImageByteArray_05.main(new String[]{});
        File outputFile = new File("src/main/java/bytearraystream/output.jpg");
        assertTrue(outputFile.exists()); // Checking if output file is created
    }

    @Test
    public void testInputFileExists() {
        File inputFile = new File("src/main/java/bytearraystream/input1.jpg");
        assertTrue(inputFile.exists()); // Checking if input file exists
    }
}

