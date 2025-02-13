package set_interface.find_subsets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindSubsets_05 {

    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>(Arrays.asList(2,3));
        Set<Integer> set2=new HashSet<>(Arrays.asList(1,2,3,4));

        boolean res=checkSubset(set1, set2);
        System.out.println("Output :"+res);
    }

    public static boolean checkSubset(Set<Integer> set1, Set<Integer> set2){
        if(set2.size()>=set1.size()){
            for(Integer i : set1){
                if(!set2.contains(i)){
                    return false;
                }
            }
        }
        if(set2.size()<set1.size()){
            for(Integer i : set2){
                if(!set1.contains(i)){
                    return false;
                }
            }
        }
        return true;
    }
}
