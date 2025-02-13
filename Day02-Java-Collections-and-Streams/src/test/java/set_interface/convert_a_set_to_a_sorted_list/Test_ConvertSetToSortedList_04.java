package set_interface.convert_a_set_to_a_sorted_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class Test_ConvertSetToSortedList_04 {

    @Test
    void testSortedList(){
        Set<Integer> set=new HashSet<>(Arrays.asList(5, 3, 9, 1, 1, 4, 7, 5, 0));

        List<Integer> res=ConvertSetToSortedList_04.sortedList(set);

        List<Integer> expected=new ArrayList<>(Arrays.asList(0,1,3,4,5,7,9));
        Assertions.assertEquals(expected, res);
    }
}
