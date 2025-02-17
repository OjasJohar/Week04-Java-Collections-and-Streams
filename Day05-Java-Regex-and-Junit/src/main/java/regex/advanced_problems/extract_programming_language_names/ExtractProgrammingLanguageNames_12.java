package regex.advanced_problems.extract_programming_language_names;

import java.util.*;

public class ExtractProgrammingLanguageNames_12 {

    public static Set<String> extractingProgrammingLanguage(String text) {

        List<String> languages = Arrays.asList("Java", "Python", "JavaScript", "Go", "C", "C++", "C#",
                "Ruby", "Swift", "Kotlin", "PHP", "R", "Perl", "Rust", "Scala", "TypeScript");

        Set<String> programmingLang = new LinkedHashSet<>();
        String[] words = text.replaceAll(","," ").split("\\s+");
        for (String word : words) {
            if (languages.contains(word)){
                programmingLang.add(word);
            }
        }
        return programmingLang;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter the text");
        String text=scn.nextLine();

        Set<String> programmingLang=extractingProgrammingLanguage(text);
        if(programmingLang.isEmpty()){
            System.out.println("No programming language found.");
        }else{
            System.out.println("Programming language:");
            for (String lang:programmingLang){
                System.out.println(lang);
            }
        }
        scn.close();
    }
}
