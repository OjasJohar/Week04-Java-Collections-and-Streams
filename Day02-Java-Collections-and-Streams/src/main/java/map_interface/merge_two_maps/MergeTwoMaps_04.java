package map_interface.merge_two_maps;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps_04 {
    public static Map<String, Integer> mergeMap(Map<String,Integer> map1,Map<String,Integer> map2){
        Map<String,Integer> merge=new HashMap<>();
        for(Map.Entry<String,Integer> m:map1.entrySet()){
            String key=m.getKey();
            Integer value=m.getValue();
            merge.put(key,value);
        }

        for(Map.Entry<String,Integer> m:map2.entrySet()){
            String key=m.getKey();
            Integer value=m.getValue();

            merge.put(key,merge.getOrDefault(key,0)+value);
        }
        return merge;
    }

    public static void main(String[] args) {
        Map<String,Integer> map1=new HashMap<>();
        map1.put("A",1);
        map1.put("B",2);

        Map<String,Integer> map2=new HashMap<>();
        map2.put("B",3);
        map2.put("C",4);

        Map<String,Integer> merge=mergeMap(map1,map2);
        System.out.println("Map1 : " + map1);
        System.out.println("Map2 : " + map2);
        System.out.println("Merged map : " + merge);
    }
}
