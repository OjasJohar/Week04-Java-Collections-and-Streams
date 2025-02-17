package regex_test.basic_regex_problems_test.validate_a_license_plate_number_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import regex.basic_regex_problems.validate_a_license_plate_number.ValidateLicensePlateNumber_02;

public class ValidatePlateNumberTest_02 {
    @Test
    void testMatchPattern1(){
        String str="AB1234";//Valid:true
        boolean res= ValidateLicensePlateNumber_02.matchPattern(str);
        Assertions.assertTrue(res);
    }
    @Test
    void testMatchPattern2(){
        String str="A12345";//Invalid:false
        boolean res= ValidateLicensePlateNumber_02.matchPattern(str);
        Assertions.assertFalse(res);
    }
}
