package list_interface.reverse_a_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class Test_ReverseList_01 {

    @Test
    void testReverseArrayList(){

        List<Integer> arrList=new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original ArrayList:"+arrList);

        List<Integer> revArrList=ReverseList_01.reverseArrayList(arrList);
        System.out.println("Reversed ArrayList:"+revArrList);

        Collections.reverse(arrList);
        System.out.println("Expected ArrayList:"+ arrList);

        //Testing:
        Assertions.assertEquals(arrList, revArrList);
        System.out.println();
    }

    @Test
    void testReverseLinkedList(){
        List<Integer> linkedList=new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original LinkedList:"+linkedList);

        List<Integer> revLinkedList=ReverseList_01.reverseLinkedList(linkedList);
        System.out.println("Reversed LinkedList:"+revLinkedList);

        Collections.reverse(linkedList);
        System.out.println("Expected LinkedList:"+linkedList);

        //Testing:
        Assertions.assertEquals(linkedList, revLinkedList);
    }
}
