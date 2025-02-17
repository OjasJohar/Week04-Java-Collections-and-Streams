package regex_test.advanced_problems_test.find_repeating_words_in_sentence_test;

import org.junit.jupiter.api.Test;
import regex.advanced_problems.find_repeating_words_in_a_sentence.FindRepeatingWords_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindRepeatingWordsTest_14 {
    @Test
    void testCase1(){
        String sentence="This is is a repeated repeated word test.";
        List<String> repeatedWords= FindRepeatingWords_14.findingRepeatingWords(sentence);

        List<String> expected= Arrays.asList("is","repeated");
        assertArrayEquals(repeatedWords.toArray(),expected.toArray());
    }

    @Test
    void testCase2(){
        String sentence="This is a repeated word test.";
        List<String> repeatedWords=FindRepeatingWords_14.findingRepeatingWords(sentence);

        List<String> expected= new ArrayList<>();
        assertArrayEquals(repeatedWords.toArray(),expected.toArray());
    }

}
