package regex.basic_regex_problems.validate_a_username;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAUsername_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Input :");
        String input=sc.next();
        boolean res=matchPattern(input);

        if(res){
            System.out.println("Valid : Pattern Matches");
        }else
            System.out.println("Invalid");
    }

    public static boolean matchPattern(String input){
        //Regex Pattern
        String regex= "^[A-Za-z][a-zA-Z0-9_]{5,15}$";

        Pattern pattern = Pattern.compile(regex);

        // Create matcher object
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }
}
