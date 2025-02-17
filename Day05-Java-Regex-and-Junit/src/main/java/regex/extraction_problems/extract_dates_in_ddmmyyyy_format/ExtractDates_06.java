package regex.extraction_problems.extract_dates_in_ddmmyyyy_format;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates_06 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the text :");
        String input=sc.nextLine();

        extractMatch(input);
    }

    public static void extractMatch(String input){
        String regex="\\b\\d{2}/\\d{2}/\\d{4}\\b";
        Pattern pattern=Pattern.compile(regex);

        Matcher matcher=pattern.matcher(input);
        while(matcher.find()){
            System.out.print(matcher.group()+", ");
        }
        System.out.println("\b\b");
    }
}
