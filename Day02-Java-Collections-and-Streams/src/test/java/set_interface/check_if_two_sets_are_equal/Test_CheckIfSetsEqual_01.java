package set_interface.check_if_two_sets_are_equal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test_CheckIfSetsEqual_01 {

    @Test
    void testCheckEqual(){
        Set<Integer> set1=new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> set2=new HashSet<>(Arrays.asList(4,3,2,1));

        boolean res=CheckIfTwoSetsAreEqual_01.checkEqual(set1, set2);
        Assertions.assertTrue(res);
    }
    @Test
    void testCheckEqual2(){
        Set<Integer> set1=new HashSet<>(Arrays.asList(1,2,3,4,4));
        Set<Integer> set2=new HashSet<>(Arrays.asList(4,3,2,1));

        boolean res=CheckIfTwoSetsAreEqual_01.checkEqual2(set1, set2);
        Assertions.assertTrue(res);
    }
}
