package regex_test.extraction_problems_test.extract_dates_in_ddmmyyyy_format_test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import regex.extraction_problems.extract_dates_in_ddmmyyyy_format.ExtractDates_06;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtractDatesTest_06 {
    @Test
    @DisplayName("Extraction Problems Test")
    void testExtractMatch(){
        ByteArrayOutputStream output=new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        String str="The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        ExtractDates_06.extractMatch(str);

        String expected="12/05/2023, 15/08/2024, 29/02/2020,";
        assertEquals(expected,output.toString().trim());
    }
}
