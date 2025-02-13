//In Java, the addAll() method of the Set class is used to add all the elements of a specified collection
// to the current collection. The elements are added randomly without following any specific order.

package set_interface.union_and_intersection_of_two_sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersectionOfTwoSets_02 {

    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2=new HashSet<>(Arrays.asList(3, 4, 5));

        Set<Integer> res1=union(set1, set2);
        Set<Integer> res2=intersection(set1, set2);
        System.out.println("Union :"+res1);
        System.out.println("Intersection :"+res2);
    }

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
//        for(Integer i : set2){
//            set1.add(i);
//        }

        //Instead Use addAll.
        Set<Integer> res=new HashSet<>();
        res.addAll(set1);
        res.addAll(set2);
        return res;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> res=new HashSet<>();
        for(Integer i : set1){
            if(set2.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}
