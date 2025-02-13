package map_interface.word_frequency_counter;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test_WordFrequencyCounter_01 {

    @Test
    void countWordFrequencyTest(){
        String str="Hello world, hello Java!";
        Map<String,Integer> frequency= WordFrequencyCounter_01.countWordFrequency(str);
        Map<String,Integer> expected=new HashMap<>();
        expected.put("hello",2);
        expected.put("world,",1);
        expected.put("java!",1);
        assertTrue(expected.equals(frequency));
    }
}
