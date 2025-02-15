package regex_test.basic_regex_problems_test.validate_a_hex_color_code_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import regex.basic_regex_problems.validate_a_hex_color_code.ValidateHexColorCode_03;

public class ValidateHexColorCodeTest_03 {
    @Test
    void testMatchPattern1(){
        String str="#FFA500";//Valid:true
        boolean res= ValidateHexColorCode_03.matchPattern(str);
        Assertions.assertTrue(res);
    }
    @Test
    void testMatchPattern2(){
        String str="#ff4500";//Valid:true
        boolean res= ValidateHexColorCode_03.matchPattern(str);
        Assertions.assertTrue(res);
    }
    @Test
    void testMatchPattern3(){
        String str="#123";//Invalid:false
        boolean res= ValidateHexColorCode_03.matchPattern(str);
        Assertions.assertFalse(res);
    }
}
