package regex_test.advanced_problems_test.validate_a_credit_card_number_test;

import org.junit.jupiter.api.Test;
import regex.advanced_problems.validate_a_credit_card_number.ValidateCreditCardNumber_11;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateCreditCardNumberTest_11 {
    @Test
    void testCase1(){
        String cardNumber="4123456789123456";
        boolean isValid= ValidateCreditCardNumber_11.validatingCreditCardNumber(cardNumber);
        assertTrue(isValid);
    }

    @Test
    void testCase2(){
        String cardNumber="6123456789123456";
        boolean isValid=ValidateCreditCardNumber_11.validatingCreditCardNumber(cardNumber);
        assertFalse(isValid);
    }
}