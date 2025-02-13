/* map.getOrDefault() = This method returns value associated with a specified key
    and if the key does not exist defaultValue is returned. */

package list_interface.find_frequency_of_elements;

import java.util.*;

public class FrequencyOfElements_02 {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange"));
        System.out.println("Input :"+list);

        Map<String, Integer> map=countFrequency(list);
        System.out.println("Output :"+map);
    }

    public static Map<String, Integer> countFrequency(List<String> list){
        Map<String, Integer> map=new HashMap<>();
        for(int i=0; i<list.size(); i++){
            map.put(list.get(i), map.getOrDefault(list.get(i),0)+1);
        }
        return map;
    }
}
