package regex_test.extraction_problems_test.extract_links_from_a_web_page_test;

import org.junit.jupiter.api.Test;
import regex.extraction_problems.extract_links_from_a_web_page.ExtractLinksFromWebPage_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ExtractLinksFromWebPageTest_07 {
    @Test
    void testCase1(){
        String webpage="Visit https://www.google.com and http://example.org for more info";
        List<String> links= ExtractLinksFromWebPage_07.extractingLink(webpage);

        List<String> expected= Arrays.asList("https://www.google.com","http://example.org");
        assertArrayEquals(expected.toArray(),links.toArray());
    }

    @Test
    void testCase2(){
        String webpage="Visit and for more info";
        List<String> links=ExtractLinksFromWebPage_07.extractingLink(webpage);

        List<String> expected= new ArrayList<>();
        assertArrayEquals(expected.toArray(),links.toArray());
    }
}
