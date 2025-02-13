package set_interface.symmetric_difference;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference_03 {

    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2=new HashSet<>(Arrays.asList(3,4,5));

        Set<Integer> res=symmetricDifference(set1, set2);
        System.out.println("Output :"+res);
    }

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> temp=new HashSet<>();
        temp.addAll(set1);

        for(Integer i : set1){
            if(set2.contains(i)){
                temp.remove(i);
            }
        }
        for(Integer j : set2){
            if(!set1.contains(j)){
                temp.add(j);
            }
        }
        return temp;
    }
}
