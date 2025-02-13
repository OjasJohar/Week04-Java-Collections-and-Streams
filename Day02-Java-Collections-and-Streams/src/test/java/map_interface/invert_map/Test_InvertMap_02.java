package map_interface.invert_map;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test_InvertMap_02 {

    @Test
    void invertingMapTest(){
        Map<String,Integer> map=new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",1);

        Map<Integer, List<String>> invertMap= InvertMap_02.invertingMap(map);

        Map<Integer,List<String>> expected=new HashMap<>();
        expected.put(1, Arrays.asList("A","C"));
        expected.put(2,Arrays.asList("B"));
        assertTrue(expected.equals(invertMap));
    }
}
