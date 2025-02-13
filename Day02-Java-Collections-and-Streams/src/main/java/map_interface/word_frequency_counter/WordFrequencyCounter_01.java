package map_interface.word_frequency_counter;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter_01 {

    public static Map<String,Integer> countWordFrequency(String str){
        Map<String, Integer> frequency=new HashMap<>();
        String[] words=str.split("\\s+");
        for(String s:words){
            String temp=s.toLowerCase();
            frequency.put(temp, frequency.getOrDefault(temp,0)+1);
        }
        return frequency;
    }

    public static void main(String[] args) {
        String str="Hello world, hello Java!";
        Map<String,Integer> frequency=countWordFrequency(str);
        System.out.println("Frequency count of each word : " + frequency);
    }
}
