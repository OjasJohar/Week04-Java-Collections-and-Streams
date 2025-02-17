package regex_test.extraction_problems_test.extract_all_email_addresses_test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import regex.extraction_problems.extract_all_email_addresses_from_a_text.ExtractAllEmailAddresses_04;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtractAllEmailAddressesTest_04 {

    @Test
    @DisplayName("Extraction Problem Test")
    void testExtractMatch(){
        ByteArrayOutputStream output=new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        String str="Contact us at support@example.com and info@company.org";
        ExtractAllEmailAddresses_04.extractMatch(str);


        String expected="support@example.com" +System.lineSeparator()+"info@company.org";
        assertEquals(expected,output.toString().trim());
    }
}
