package regex_test.replace_and_modify_strings_test.replace_multiple_with_single_space_test;

import org.junit.jupiter.api.Test;
import regex.replace_and_modify_strings.replace_multiple_spaces_with_single_space.ReplaceMultipleWithSingleSpace_08;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReplaceMultipleWithSingleSpaceTest_08 {
    @Test
    void testcase1(){
        String extraSpaces="This is an   example   with multiple      spaces.";
        String singleSpace= ReplaceMultipleWithSingleSpace_08.removingExtraSpace(extraSpaces);

        String expected="This is an example with multiple spaces.";
        assertArrayEquals(singleSpace.toCharArray(),expected.toCharArray());
    }

    @Test
    void testcase2(){
        String extraSpaces="";
        String singleSpace=ReplaceMultipleWithSingleSpace_08.removingExtraSpace(extraSpaces);

        String expected="";
        assertArrayEquals(singleSpace.toCharArray(),expected.toCharArray());
    }
}
