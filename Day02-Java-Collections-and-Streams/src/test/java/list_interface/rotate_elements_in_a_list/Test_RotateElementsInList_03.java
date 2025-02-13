package list_interface.rotate_elements_in_a_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_RotateElementsInList_03 {

    @Test
    void testRotation(){
        List<Integer> list=new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        List<Integer> rotatedList1=RotateElementsInList_03.rotateList(list, 2);
        List<Integer> expected1=new ArrayList<>(Arrays.asList(30, 40, 50, 10, 20));
        Assertions.assertEquals(expected1 ,rotatedList1);

        List<Integer> rotatedList2=RotateElementsInList_03.rotateList(list, 3);
        List<Integer> expected2=new ArrayList<>(Arrays.asList(40, 50, 10, 20, 30));
        Assertions.assertEquals(expected2 ,rotatedList2);
    }
}
