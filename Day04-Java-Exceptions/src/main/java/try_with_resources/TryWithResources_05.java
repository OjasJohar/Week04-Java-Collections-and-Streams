package try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources_05 {
    public static void readingFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Error Reading File.");
        }
    }
    public static void main(String[] args) {
        String filePath = "src/main/java/try_with_resources/info.txt";
        readingFile(filePath);
    }
}
