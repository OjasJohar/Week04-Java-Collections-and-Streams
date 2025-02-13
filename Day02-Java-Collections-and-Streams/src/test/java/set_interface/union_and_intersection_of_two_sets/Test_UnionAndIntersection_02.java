package set_interface.union_and_intersection_of_two_sets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test_UnionAndIntersection_02 {

    @Test
    void testUnion(){
        Set<Integer> set1=new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2=new HashSet<>(Arrays.asList(3, 4, 5));

        Set<Integer> res=UnionAndIntersectionOfTwoSets_02.union(set1, set2);
        Set<Integer> expected=new HashSet<>(Arrays.asList(1,2,3,4,5));

        Assertions.assertEquals(expected, res);
    }

    @Test
    void testIntersection(){
        Set<Integer> set1=new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2=new HashSet<>(Arrays.asList(3, 4, 5, 6));

        Set<Integer> res=UnionAndIntersectionOfTwoSets_02.intersection(set1, set2);
        Set<Integer> expected=new HashSet<>(Arrays.asList(3, 4));

        Assertions.assertEquals(expected, res);
    }
}
