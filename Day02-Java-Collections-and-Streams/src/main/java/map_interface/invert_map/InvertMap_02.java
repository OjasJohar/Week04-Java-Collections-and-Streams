package map_interface.invert_map;

import java.util.*;

public class InvertMap_02 {
    public static Map<Integer, List<String>> invertingMap(Map<String ,Integer> map){
        Map<Integer,List<String>> invertMap=new HashMap<>();

        for(Map.Entry<String,Integer> mapElement: map.entrySet()){

            String key=mapElement.getKey();
            Integer value=mapElement.getValue();
            List<String> list=new ArrayList<>();
            //list.add(invertMap.get(value));

            if(invertMap.containsKey(value)) {
                for (String s : invertMap.get(value)) {
                    list.add(s);
                }
            }

            list.add(key);
            invertMap.put(value,list);
        }
        return invertMap;
    }

    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",1);

        Map<Integer,List<String>> invertMap=invertingMap(map);
        System.out.println("Original map : " + map);
        System.out.println("Inverted map : " + invertMap);
    }
}
