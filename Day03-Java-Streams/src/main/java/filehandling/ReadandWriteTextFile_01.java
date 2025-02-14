package filehandling;
import java.io.*;
import java.lang.System;

public class ReadandWriteTextFile_01 {
    public static void readWriteFile(String fileinput, String fileOutput){


       File destinationFile = new File(fileOutput);

       try {
           if (!destinationFile.exists()) {
               destinationFile.createNewFile();
           }

           try (FileInputStream fin = new FileInputStream(fileinput);
                FileOutputStream fout = new FileOutputStream(destinationFile)) {

               int byteData;
               while ((byteData = fin.read()) != -1) {
                   fout.write(byteData);
               }
               System.out.println("File copied Successfully!");
           } catch (FileNotFoundException e) {
               e.printStackTrace();
           }
       }catch (IOException e) {
               e.printStackTrace();
           }

    }

    public static void main(String[] args) {
        String inputfile = "src\\main\\java\\filehandling\\input.txt";
        String outputfile = "src\\main\\java\\filehandling\\output.txt";

        readWriteFile(inputfile,outputfile);
    }
}
