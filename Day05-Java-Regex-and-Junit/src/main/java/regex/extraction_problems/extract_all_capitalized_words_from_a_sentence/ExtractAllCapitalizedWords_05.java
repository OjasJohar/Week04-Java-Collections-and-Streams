package regex.extraction_problems.extract_all_capitalized_words_from_a_sentence;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllCapitalizedWords_05 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the text :");
        String input=sc.nextLine();

        extractMatch(input);
    }

    public static void extractMatch(String input){
        String regex="[A-Z][a-z]*";
        Pattern pattern=Pattern.compile(regex);

        Matcher matcher=pattern.matcher(input);
        while(matcher.find()){
            System.out.print(matcher.group()+", ");
        }
        System.out.print("\b\b");//removes character from last.
    }
}
