//In Java, the equals() method of the Set class is used to compare two sets for equality.
//It checks if two sets contain the same elements regardless of their order.

package set_interface.check_if_two_sets_are_equal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckIfTwoSetsAreEqual_01 {

    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>(Arrays.asList(1,2,3));
        System.out.println(set1);
        Set<Integer> set2=new HashSet<>(Arrays.asList(3,2,1));
        //Use LinkedHashSet if insertion like {3,2,1} needed.
        System.out.println(set2);

        System.out.println("Output :"+checkEqual(set1, set2));
        System.out.println("Output :"+checkEqual2(set1, set2));
    }

    public static boolean checkEqual(Set<Integer> set1, Set<Integer> set2){
        return set1.equals(set2);
    }

    public static boolean checkEqual2(Set<Integer> set1, Set<Integer> set2){

        if(set1.size()!=set2.size()){
            return false;
        }
        for(Integer i : set1){
            if(!set2.contains(i)){
                return false;
            }
        }
        return true;
    }
}
