package list_interface.find_frequency_of_elements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Test_FrequencyOfElements_02 {

    @Test
    void testMap(){
        List<String> list=new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange"));

        Map<String, Integer> map=FrequencyOfElements_02.countFrequency(list);

        Assertions.assertEquals(2, map.get("apple"));
        Assertions.assertEquals(1, map.get("banana"));
        Assertions.assertEquals(1, map.get("orange"));
    }
}
