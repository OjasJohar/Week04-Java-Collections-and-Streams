package checked_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException_01 {

    public static void readingFile(String filePath){
        try(BufferedReader br=new BufferedReader(new FileReader(filePath))){
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        }catch (IOException e) {
            System.out.println("File not found");
        }
    }

    public static void main(String[] args) {
        String filePath="src/main/java/checked_exception/Data.txt";
        readingFile(filePath);
    }
}