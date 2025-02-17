package regex.advanced_problems.find_repeating_words_in_a_sentence;

import java.util.*;

public class FindRepeatingWords_14 {

    public static List<String> findingRepeatingWords(String sentence){
        Map<String,Integer> frequency=new HashMap<>();
        String[] words=sentence.split("\\s+");
        for(String word:words){
            frequency.put(word,frequency.getOrDefault(word,0)+1);
        }

        List<String> repeatedWords=new ArrayList<>();
        for(Map.Entry<String,Integer> map:frequency.entrySet()){
            if(map.getValue()>1){
                repeatedWords.add(map.getKey());
            }
        }
        return repeatedWords;
    }

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);

        System.out.println("Enter the sentence:");
        String sentence=scn.nextLine();

        List<String> repeatedWords=findingRepeatingWords(sentence);
        if(repeatedWords.isEmpty()){
            System.out.println("No repeated word found:");
        }else{
            System.out.println("Repeated words:");
            for (String word:repeatedWords){
                System.out.println(word);
            }
        }
    }
}
