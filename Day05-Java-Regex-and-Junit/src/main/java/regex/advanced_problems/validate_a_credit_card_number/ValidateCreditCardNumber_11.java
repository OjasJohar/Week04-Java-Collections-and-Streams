package regex.advanced_problems.validate_a_credit_card_number;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCardNumber_11 {
    public static boolean validatingCreditCardNumber(String cardNumber){
        String regex="[4-5][0-9]{15}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(cardNumber);

        return matcher.find();
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter the Credit card Number:");
        String cardNumber=scn.next();

        boolean isValid=validatingCreditCardNumber(cardNumber);
        if(isValid){
            System.out.println("Credit Card Number :" + cardNumber + ", is valid");
        }else{
            System.out.println("credit Card Number :" + cardNumber + ", is not valid");
        }
        scn.close();
    }
}
