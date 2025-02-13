package list_interface.reverse_a_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseList_01 {

    public static void main(String[] args) {
        //1. ArrayList
        List<Integer> arrayList=new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("ArrayList :"+arrayList);

        List<Integer> reverseArr=reverseArrayList(arrayList);
        System.out.println("Reverse ArrayList :"+ reverseArr);

        //2. LinkedList
        List<Integer> linkedList=new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("LinkedList :"+linkedList);

        List<Integer> reverseLinked=reverseLinkedList(linkedList);
        System.out.println("Reverse LinkedList :"+ reverseLinked);
    }

    public static List<Integer> reverseArrayList(List<Integer> arrayList){

        List<Integer> reverseArr=new ArrayList<>();
        // Iterating using for loop
        for(int i=arrayList.size()-1; i>=0; i--){
            reverseArr.add(arrayList.get(i));
        }
        return reverseArr;
    }

    public static List<Integer> reverseLinkedList(List<Integer> linkedList){

        List<Integer> reverseLinked=new LinkedList<>();
        // Iterating using for loop
        for(int i=linkedList.size()-1; i>=0; i--){
            reverseLinked.add(linkedList.get(i));
        }
        return reverseLinked;
    }
}