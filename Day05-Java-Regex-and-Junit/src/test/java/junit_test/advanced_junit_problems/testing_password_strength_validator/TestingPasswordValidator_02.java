package junit_test.advanced_junit_problems.testing_password_strength_validator;

import junit.advanced_junit_problems.testing_password_strength_validator.PasswordValidator_02;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestingPasswordValidator_02 {
    @Test
    @DisplayName("Test: password length less than 8")
    void testCase1(){
        String password="abcd123";
        boolean check= PasswordValidator_02.validator(password);
        assertFalse(check);
    }

    @Test
    @DisplayName("Test: password contain at least 1 uppercase")
    void testCase2(){
        String password="abcd123";
        boolean check=PasswordValidator_02.validator(password);
        assertFalse(check);
    }

    @Test
    @DisplayName("Test: password contain at least 1 digit")
    void testCase3(){
        String password="abcdcd";
        boolean check=PasswordValidator_02.validator(password);
        assertFalse(check);
    }

    @Test
    @DisplayName("Test: correct password")
    void testCase4(){
        String password="abcd123AD";
        boolean check=PasswordValidator_02.validator(password);
        assertTrue(check);
    }
}
