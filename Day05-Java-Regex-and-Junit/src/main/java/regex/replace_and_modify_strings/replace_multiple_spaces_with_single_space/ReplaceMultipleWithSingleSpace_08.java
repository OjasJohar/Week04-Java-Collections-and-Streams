package regex.replace_and_modify_strings.replace_multiple_spaces_with_single_space;

import java.util.Scanner;

public class ReplaceMultipleWithSingleSpace_08 {
    public static String removingExtraSpace(String extraSpaces){
        return extraSpaces.replaceAll("\\s+"," ");
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter the sentence with multiple spaces:");
        String extraSpaces=input.nextLine();

        String singleSpace=removingExtraSpace(extraSpaces);

        System.out.println(singleSpace);
    }
}
