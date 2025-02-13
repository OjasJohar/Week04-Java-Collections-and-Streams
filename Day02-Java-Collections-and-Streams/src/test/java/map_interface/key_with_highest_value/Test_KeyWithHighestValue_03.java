package map_interface.key_with_highest_value;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_KeyWithHighestValue_03 {
    @Test
    void highestValueTest(){
        Map<String,Integer> map=new HashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",15);
        System.out.println("Map : " + map);
        String key= KeyWithHighestValue_03.highestValue(map);
        assertEquals("B",key);
    }

}
