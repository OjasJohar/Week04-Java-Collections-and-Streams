package filereading;

import java.io.*;

public class ReadingFileLineByLine_09 {
    public static void main(String[] args) {
        String filePath = "src/main/java/filereading/input.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
