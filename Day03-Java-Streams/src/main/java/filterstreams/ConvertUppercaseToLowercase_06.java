package filterstreams;
import java.io.*;

public class ConvertUppercaseToLowercase_06 {
    public static void main(String[] args) {
        String inputFile = "src/main/java/filterstreams/input.txt";
        String outputFile = "src/main/java/filterstreams/output.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line.toLowerCase());
                bw.newLine();
            }

            System.out.println("File successfully converted to lowercase.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
