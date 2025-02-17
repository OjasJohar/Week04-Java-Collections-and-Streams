package regex.basic_regex_problems.validate_a_license_plate_number;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicensePlateNumber_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the license plate number :");
        String input=sc.next();
        boolean res=matchPattern(input);

        if(res){
            System.out.println("Valid");
        }else
            System.out.println("Invalid");
    }

    public static boolean matchPattern(String input){
        //Regex Pattern
        String regex= "^[A-Z]{2}\\d{4}$";

        Pattern pattern = Pattern.compile(regex);

        // Create matcher object
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }
}
