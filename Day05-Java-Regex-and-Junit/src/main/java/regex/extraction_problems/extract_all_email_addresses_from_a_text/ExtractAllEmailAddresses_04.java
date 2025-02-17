package regex.extraction_problems.extract_all_email_addresses_from_a_text;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllEmailAddresses_04 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the text :");
        String input=sc.nextLine();
        extractMatch(input);
    }

    public static void extractMatch(String input){
        String regex="[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";
        Pattern pattern=Pattern.compile(regex);

        Matcher matcher=pattern.matcher(input);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
