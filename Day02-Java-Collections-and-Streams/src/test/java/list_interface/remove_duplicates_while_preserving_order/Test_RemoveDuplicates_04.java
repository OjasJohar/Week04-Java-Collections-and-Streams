package list_interface.remove_duplicates_while_preserving_order;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_RemoveDuplicates_04 {

    @Test
    void testRemoveDuplicates(){
        List<Integer> list=new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4, 2, 2, 2, 5));
        list=RemoveDuplicates_04.removeDuplicates(list);
        System.out.println(list);

        List<Integer> expected=new ArrayList<>(Arrays.asList(3, 1, 2, 4, 5));
        System.out.println(expected);

        //Testing.
        Assertions.assertEquals(expected, list);
    }
}
