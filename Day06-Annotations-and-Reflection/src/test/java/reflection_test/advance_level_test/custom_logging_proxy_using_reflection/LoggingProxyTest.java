package reflection_test.advance_level_test.custom_logging_proxy_using_reflection;

import reflection.advance_level.custom_logging_proxy_using_reflection.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Proxy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LoggingProxyTest {
    private Greeting greetingProxy;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        // Redirect System.out to capture logs
        System.setOut(new PrintStream(outputStreamCaptor));

        // Create an instance of the original class
        Greeting greetingImpl = new GreetingImpl();

        // Create a dynamic proxy instance
        greetingProxy = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingProxyHandler(greetingImpl)
        );
    }

    @Test
    void testMethodInvocationLogsMethodName() {
        // Call the method
        String response = greetingProxy.sayHello("John");

        // Verify the method response
        assertEquals("John", response, "Method should return the correct greeting");

        // Capture log output
        String logOutput = outputStreamCaptor.toString().trim();

        // Assert that log contains expected message
        assertTrue(logOutput.contains("Executing method: sayHello"), "Log should contain method execution message");
    }
}
