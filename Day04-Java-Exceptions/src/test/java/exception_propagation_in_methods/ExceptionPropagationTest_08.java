package exception_propagation_in_methods;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionPropagationTest_08 {
    @Test
    void propagationTest(){
        Exception exception=assertThrows(ArithmeticException.class,()->ExceptionPropagationInMethods_08.method2(10,0));
        assertEquals("/ by zero",exception.getMessage());
    }
    @Test
    void propagationSuccessfulTest() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        ExceptionPropagationInMethods_08.method2(10, 2);
        assertEquals("Division:5", output.toString().trim());
    }
}