package map_interface.key_with_highest_value;

import java.util.HashMap;
import java.util.Map;

public class KeyWithHighestValue_03 {

    public static String highestValue(Map<String,Integer> map){
        int max=Integer.MIN_VALUE;
        String key="";
        for(Map.Entry<String,Integer> m:map.entrySet()){
            if(m.getValue()>=max){
                max=m.getValue();
                key=m.getKey();
            }
        }
        return key;
    }

    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",15);
        System.out.println("Map : " + map);
        String key=highestValue(map);
        System.out.println("Key with highest value : " + key);
    }
}
