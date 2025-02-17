package regex_test.advanced_problems_test.validate_social_security_number_test;

import org.junit.jupiter.api.Test;
import regex.advanced_problems.validate_social_security_number.ValidateSocialSecurityNumber_15;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateSocialSecurityNumberTest_15 {
    @Test
    void testCase1(){
        String ssn="My SSN is 123-45-6789.";
        boolean isValid= ValidateSocialSecurityNumber_15.validatingSSN(ssn);
        assertTrue(isValid);
    }

    @Test
    void testCase2(){
        String ssn="My SSN is 123456789";
        boolean isValid=ValidateSocialSecurityNumber_15.validatingSSN(ssn);
        assertFalse(isValid);
    }
}
