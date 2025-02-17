package junit.basic_junit_test.testing_file_handling_methods;

import java.io.*;

public class FileProcessor_08 {

    public void writeToFile(String filename, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
        }
    }
    public String readFromFile(String filename) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString().trim();
    }

    public static void main(String[] args) {
        FileProcessor_08 fileProcessor = new FileProcessor_08();
        String filename = "example.txt";
        String content = "Hello !!, this is a test file!";

        try {
            fileProcessor.writeToFile(filename, content);
            System.out.println("File written successfully.");

            String readContent = fileProcessor.readFromFile(filename);
            System.out.println("Read from file: " + readContent);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}