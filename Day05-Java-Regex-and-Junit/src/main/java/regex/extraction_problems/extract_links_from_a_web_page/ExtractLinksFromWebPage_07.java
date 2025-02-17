package regex.extraction_problems.extract_links_from_a_web_page;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinksFromWebPage_07 {
    public static List<String> extractingLink(String webpage){
        String regex="https?://(www\\.)?([a-zA-Z0-9.-/]+)";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(webpage);

        List<String> links=new ArrayList<>();
        while(matcher.find()){
            links.add(matcher.group());
        }
        return links;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Text : ");
        String webpage=input.nextLine();

        List<String> links=extractingLink(webpage);

        if(links.isEmpty()){
            System.out.println("No link found.");
        }else{
            System.out.println("Links in given text are:");
            for (String link:links){
                System.out.println(link);
            }
        }
        input.close();
    }
}
