package pipedstreams;
import java.io.*;

public class InterThreadCommunication_08 {
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            Thread writer = new Thread(() -> {
                try {
                    pos.write("Hello from Writer Thread!".getBytes());
                    pos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            Thread reader = new Thread(() -> {
                try {
                    int data;
                    while ((data = pis.read()) != -1) {
                        System.out.print((char) data);
                    }
                    pis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            writer.start();
            reader.start();

            writer.join();
            reader.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
