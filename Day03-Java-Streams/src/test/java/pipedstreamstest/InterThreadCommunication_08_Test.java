package pipedstreamstest;
import org.junit.jupiter.api.Test;
import pipedstreams.InterThreadCommunication_08;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class InterThreadCommunication_08_Test {

    @Test
    public void testPipedCommunication() throws IOException {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);

        Thread writer = new Thread(() -> {
            try {
                pos.write("Test Message".getBytes());
                pos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        StringBuilder result = new StringBuilder();
        Thread reader = new Thread(() -> {
            try {
                int data;
                while ((data = pis.read()) != -1) {
                    result.append((char) data);
                }
                pis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        writer.start();
        reader.start();

        try {
            writer.join();
            reader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("Test Message", result.toString()); // Checking  if message is transmitted correctly
    }

    @Test
    public void testNoExceptionThrown() {
        assertDoesNotThrow(() -> InterThreadCommunication_08.main(new String[]{})); // Ensuring main runs without errors
    }
}
