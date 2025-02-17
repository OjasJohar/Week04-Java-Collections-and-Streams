package regex_test.advanced_problems_test.extract_currency_values_from_text_test;

import org.junit.jupiter.api.Test;
import regex.advanced_problems.extract_currency_values_from_text.ExtractCurrencyValues_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ExtractCurrencyValuesTest_13 {
    @Test
    void testCase1(){
        String text = "The price is $45.99, and the discount is 10.50.";
        List<String> currency = ExtractCurrencyValues_13. extractingCurrencyValue(text);

        List<String> expected= Arrays.asList("$45.99","10.50");
        assertArrayEquals(currency.toArray(),expected.toArray());
    }

    @Test
    void testCase2(){
        String text = "The price is, and the discount is and.";
        List<String> currency =ExtractCurrencyValues_13. extractingCurrencyValue(text);

        List<String> expected= new ArrayList<>();
        assertArrayEquals(currency.toArray(),expected.toArray());
    }
}
