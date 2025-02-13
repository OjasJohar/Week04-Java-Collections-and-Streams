package list_interface.find_the_nth_element_from_the_end;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class Test_FindNthElementFromEnd_05 {

    @Test
    void testFindElement1(){
        LinkedList<Character> list=new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));

        char element=FindNthElementFromEnd_05.findElement(list, 2);
        System.out.println(element);
        Assertions.assertEquals('D', element);
    }
    @Test
    void testFindElement2(){
        LinkedList<Character> list=new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));

        char element=FindNthElementFromEnd_05.findElement(list, 4);
        System.out.println(element);
        Assertions.assertEquals('B', element);
    }
}
