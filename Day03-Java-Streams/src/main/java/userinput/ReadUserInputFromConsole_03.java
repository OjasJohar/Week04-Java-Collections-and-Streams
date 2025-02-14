package userinput;

import java.io.*;

public class ReadUserInputFromConsole_03 {
    public static void main(String[] args) {
        //file where data saved
        String outputFile = "src/main/java/userinput/user_data.txt";


        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(outputFile, true)) { // Append mode enabled


            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // Write user data to file
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");
            writer.write("----------------------\n"); // Separator for multiple entries

            System.out.println("User data has been saved to " + outputFile);

        } catch (IOException e) {
            System.err.println("Error occurred while reading input or writing to file.");
            e.printStackTrace();
        }
    }
}
