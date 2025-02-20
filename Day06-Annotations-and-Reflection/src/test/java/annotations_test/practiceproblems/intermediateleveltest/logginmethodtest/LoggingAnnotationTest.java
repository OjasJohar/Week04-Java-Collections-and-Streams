package annotations_test.practiceproblems.intermediateleveltest.logginmethodtest;

import annotations.practiceproblems.intermediatelevel.LoggingMethodTime.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

class LoggingAnnotationTest {

    private String captureOutput(Runnable action) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            action.run();
        } finally {
            System.setOut(originalOut);
        }

        return outputStream.toString().trim();
    }

    @Test
    void testProcessDataExecutionTime() throws Exception {
        LoggingAnnotation service = new LoggingAnnotation();
        Method method = service.getClass().getMethod("processData");

        if (method.isAnnotationPresent(LogExecutionTime.class)) {
            String output = captureOutput(() -> {
                LogExecutionTime annotation = method.getAnnotation(LogExecutionTime.class);
                long startTime = System.nanoTime();
                service.processData();
                long endTime = System.nanoTime();
                System.out.println(annotation.message() + (endTime - startTime) / 1000 + "ms");
            });

            assertTrue(output.contains("Process executing"));
            assertTrue(output.contains("Time taken: "));
        }
    }
}
