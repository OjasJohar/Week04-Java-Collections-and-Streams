package set_interface.symmetric_difference;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test_SymmetricDifference_03 {

    @Test
    void testSymmetricDifference(){
        Set<Integer> set1=new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        Set<Integer> set2=new HashSet<>(Arrays.asList(3,4,5));

        Set<Integer> res=SymmetricDifference_03.symmetricDifference(set1, set2);
        Set<Integer> expected=new HashSet<>(Arrays.asList(1,2,6));

        Assertions.assertEquals(expected, res);
    }
    @Test
    void testSymmetricDifference2(){
        Set<Integer> set1=new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> set2=new HashSet<>(Arrays.asList(3,4,5,6,7));

        Set<Integer> res=SymmetricDifference_03.symmetricDifference(set1, set2);
        Set<Integer> expected=new HashSet<>(Arrays.asList(1,2,5,6,7));

        Assertions.assertEquals(expected, res);
    }
}
