package regex_test.advanced_problems_test.extract_programming_language_names_test;

import org.junit.jupiter.api.Test;
import regex.advanced_problems.extract_programming_language_names.ExtractProgrammingLanguageNames_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ExtractProgrammingLangNamesTest_12 {
    @Test
    void testCase1(){
        String text="I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        Set<String> programmingLang= ExtractProgrammingLanguageNames_12.extractingProgrammingLanguage(text);

        List<String> expected= Arrays.asList("Java","Python","JavaScript","Go");
        assertArrayEquals(programmingLang.toArray(),expected.toArray());
    }

    @Test
    void testCase2(){
        String text="but I haven't tried yet.";
        Set<String> programmingLang=ExtractProgrammingLanguageNames_12.extractingProgrammingLanguage(text);

        List<String> expected= new ArrayList<>();
        assertArrayEquals(programmingLang.toArray(),expected.toArray());
    }
}
