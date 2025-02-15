package unchecked_exception_test;

import org.junit.jupiter.api.Test;
import unchecked_exception.UncheckedException_02;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UncheckedExceptionTest_02 {
    @Test
    void testDivideTwoNumbers() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        UncheckedException_02.divideTwoNumbers(10, 2);
        assertTrue(outputStream.toString().contains("Answer(10/2) : 5"));
    }
    @Test
    void testDivideByZero(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // Test division by zero
        UncheckedException_02.divideTwoNumbers(10, 0);
        assertTrue(outputStream.toString().contains("Invalid operation: Divide by zero."));
    }
}
