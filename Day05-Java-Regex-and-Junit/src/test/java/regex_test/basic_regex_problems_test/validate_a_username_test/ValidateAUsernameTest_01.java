package regex_test.basic_regex_problems_test.validate_a_username_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import regex.basic_regex_problems.validate_a_username.ValidateAUsername_01;

public class ValidateAUsernameTest_01 {

    @Test
    void testMatchPattern1(){
        String str="user_123";//Valid:true
        boolean res=ValidateAUsername_01.matchPattern(str);
        Assertions.assertTrue(res);
    }
    @Test
    void testMatchPattern2(){
        String str="123user";//Invalid:false
        boolean res=ValidateAUsername_01.matchPattern(str);
        Assertions.assertFalse(res);
    }
    @Test
    void testMatchPattern3(){
        String str="us";//Invalid:false
        boolean res=ValidateAUsername_01.matchPattern(str);
        Assertions.assertFalse(res);
    }
}
