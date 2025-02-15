package custom_exception;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomExceptionTest_03 {
    @Test
    void testValidateAge_AgeAbove18() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        CustomException_03.validateAge(20);
        assertTrue(outContent.toString().trim().contains("Access granted"));
    }
    @Test
    void testValidateAge_AgeBelow18() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        CustomException_03.validateAge(15);
        assertTrue(outContent.toString().trim().contains("Age must be 18 or above"));
    }
}
