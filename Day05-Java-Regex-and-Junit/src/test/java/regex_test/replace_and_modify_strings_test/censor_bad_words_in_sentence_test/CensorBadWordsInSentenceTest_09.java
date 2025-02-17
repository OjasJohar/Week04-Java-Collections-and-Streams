package regex_test.replace_and_modify_strings_test.censor_bad_words_in_sentence_test;

import org.junit.jupiter.api.Test;
import regex.replace_and_modify_strings.censor_bad_words_in_a_sentence.CensorBadWordsInSentence_09;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CensorBadWordsInSentenceTest_09 {
    @Test
    void testCase1(){
        String sentence="This is a damn bad example with some stupid words.";
        String goodstring=CensorBadWordsInSentence_09.censoringBadWords(sentence);

        String expected="This is a **** bad example with some **** words. ";
        assertArrayEquals(goodstring.toCharArray(),expected.toCharArray());
    }

    @Test
    void testCase2(){
        String sentence="This is a bad example with some words.";
        String goodstring= CensorBadWordsInSentence_09.censoringBadWords(sentence);

        String expected="This is a bad example with some words. ";
        assertArrayEquals(goodstring.toCharArray(),expected.toCharArray());
    }
}
