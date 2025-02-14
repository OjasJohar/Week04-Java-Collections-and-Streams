package bufferedstreams;

import java.io.*;

public class BufferedFileCopy_02 {
    private static final int BUFFER_SIZE = 4096; // 4 KB buffer

    public static void main(String[] args) {
        String sourceFile = "src/main/java/bufferedstreams/100mb-examplefile-com (1).txt"; // Change path accordingly
        String destFileBuffered = "src/main/java/bufferedstreams/output.txt";
        String destFileUnbuffered = "src/main/java/bufferedstreams/output.txt";;

        // Copy using Buffered Streams
        long bufferedTime = copyWithBufferedStreams(sourceFile, destFileBuffered);
        System.out.println("Buffered Stream Copy Time: " + bufferedTime + " ms");

        // Copy using Unbuffered Streams
        long unbufferedTime = copyWithUnbufferedStreams(sourceFile, destFileUnbuffered);
        System.out.println("Unbuffered Stream Copy Time: " + unbufferedTime + " ms");

        // Compare performance
        System.out.println("Buffered copy is " + (unbufferedTime / (double) bufferedTime) + " times faster than unbuffered.");
    }


    public static long copyWithBufferedStreams(String source, String destination) {
        long startTime = System.nanoTime();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.err.println("Error in Buffered Stream Copy: " + e.getMessage());
        }

        return (System.nanoTime() - startTime)/1000000;
    }


    public static long copyWithUnbufferedStreams(String source, String destination) {
        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.err.println("Error in Unbuffered Stream Copy: " + e.getMessage());
        }

        return (System.nanoTime() - startTime)/1000000;
    }
}
