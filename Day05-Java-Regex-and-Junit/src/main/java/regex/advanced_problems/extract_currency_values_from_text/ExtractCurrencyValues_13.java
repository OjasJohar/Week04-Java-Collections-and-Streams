package regex.advanced_problems.extract_currency_values_from_text;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyValues_13 {
    public static List<String> extractingCurrencyValue(String text) {
        List<String> currency = new ArrayList<>();
        String regex = "[$]?[0-9]+[.]?[0-9]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            currency.add(matcher.group());
        }
        return currency;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the text");
        String text = scn.nextLine();

        List<String> currency = extractingCurrencyValue(text);
        if (currency.isEmpty()) {
            System.out.println("No currency value found.");
        } else {
            System.out.println("Currencies: ");
            for (String value : currency) {
                System.out.println(value);
            }
        }
        scn.close();
    }
}
