package regex.advanced_problems.validate_social_security_number;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSocialSecurityNumber_15 {
    public static boolean validatingSSN(String ssn){
        String regex="[0-9]{3}-[0-9]{2}-[0-9]{4}";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(ssn);

        return matcher.find();
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter the Social Security Number:");
        String ssn=scn.nextLine();

        boolean isValid=validatingSSN(ssn);
        if(isValid){
            System.out.println("Social Security Number is valid");
        }else{
            System.out.println("Social Security Number is not valid");
        }
        scn.close();
    }
}
