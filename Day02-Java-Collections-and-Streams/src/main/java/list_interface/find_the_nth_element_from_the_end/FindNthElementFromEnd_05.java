package list_interface.find_the_nth_element_from_the_end;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class FindNthElementFromEnd_05 {

    public static void main(String[] args) {
        LinkedList<Character> list=new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        System.out.print("Enter the Nth Term To Find :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        char element=findElement(list, n);
        System.out.println("Nth Element :"+element);
    }

    public static char findElement(LinkedList<Character> list, int n){
        while(n-1>0){
            //To remove the elements from last till n.
            list.pollLast();
            n--;
        }
        return list.getLast();
    }
}
