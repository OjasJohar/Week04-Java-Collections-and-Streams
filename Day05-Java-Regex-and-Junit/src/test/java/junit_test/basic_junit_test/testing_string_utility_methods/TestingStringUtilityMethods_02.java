package junit_test.basic_junit_test.testing_string_utility_methods;

import junit.basic_junit_test.testing_string_utility_methods.StringUtilityMethods_02;
import org.junit.jupiter.api.*;

public class TestingStringUtilityMethods_02 {
    private StringUtilityMethods_02 obj;

    @BeforeEach
    void print(){
        obj=new StringUtilityMethods_02();
        System.out.println("Test started");
    }
    @AfterEach
    void print2(){
        System.out.println("Test Completed");
    }

    @Test
    @DisplayName("Test 1: For Reversing String")
    void testReverse(){
        String str="Ojas";
        String res=obj.reverse(str);
        Assertions.assertEquals("sajO", res);
    }
    @Test
    @DisplayName("Test 2: For Palindrome String")
    void testPalindrome(){
        String str="OjassajO";
        boolean res=obj.isPalindrome(str);
        Assertions.assertTrue(res);
    }
    @Test
    @DisplayName("Test 3: For UpperCase String")
    void testUppercase(){
        String str="Ojas";
        String res=obj.toUpperCase(str);
        Assertions.assertEquals("OJAS", res);
    }
}
