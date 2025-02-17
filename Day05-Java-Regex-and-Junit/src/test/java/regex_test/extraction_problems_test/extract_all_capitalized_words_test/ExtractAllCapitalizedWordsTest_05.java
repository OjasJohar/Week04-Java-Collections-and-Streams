package regex_test.extraction_problems_test.extract_all_capitalized_words_test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import regex.extraction_problems.extract_all_capitalized_words_from_a_sentence.ExtractAllCapitalizedWords_05;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtractAllCapitalizedWordsTest_05 {

    @Test
    @DisplayName("Extraction Problem Test")
    void testExtractMatch(){
        ByteArrayOutputStream output=new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        String str="The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        ExtractAllCapitalizedWords_05.extractMatch(str);

        String expected="The, Eiffel, Tower, Paris, Statue, Liberty, New, York,";
        assertEquals(expected,output.toString().trim());
    }
}
