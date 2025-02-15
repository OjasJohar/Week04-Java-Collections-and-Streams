package regex.basic_regex_problems.validate_a_hex_color_code;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHexColorCode_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the hex color code :");
        String input=sc.next();
        boolean res=matchPattern(input);

        if(res){
            System.out.println("Valid Hex Color");
        }else
            System.out.println("Invalid");
    }

    public static boolean matchPattern(String input){

        if (input.isEmpty()){
            return false;
        }
        //Regex Pattern
        String regex= "^#[0-9A-Fa-f]{6}$";

        Pattern pattern = Pattern.compile(regex);

        // Create matcher object
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }
}
