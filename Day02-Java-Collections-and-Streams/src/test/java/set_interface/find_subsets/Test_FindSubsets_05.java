package set_interface.find_subsets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test_FindSubsets_05 {

    @Test
    void testCheckSubset(){
        Set<Integer> set1=new HashSet<>(Arrays.asList(2,3,4,5,6));
        Set<Integer> set2=new HashSet<>(Arrays.asList(2,3,4));

        boolean res=FindSubsets_05.checkSubset(set1, set2);

        Assertions.assertTrue(res);
    }

    @Test
    void testCheckSubset2(){
        Set<Integer> set1=new HashSet<>(Arrays.asList(2,3,4));
        Set<Integer> set2=new HashSet<>(Arrays.asList(1,2,3,4,5));

        boolean res=FindSubsets_05.checkSubset(set1, set2);

        Assertions.assertTrue(res);
    }
}
