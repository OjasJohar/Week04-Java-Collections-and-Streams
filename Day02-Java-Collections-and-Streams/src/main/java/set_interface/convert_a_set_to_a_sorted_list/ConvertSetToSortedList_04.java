package set_interface.convert_a_set_to_a_sorted_list;

import java.util.*;

public class ConvertSetToSortedList_04 {

    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>(Arrays.asList(5, 3, 9, 1));
        System.out.println("Set :"+set);

        List<Integer> res=sortedList(set);
        System.out.println("Sorted List :"+res);
    }

    public static List<Integer> sortedList(Set<Integer> set){
        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}
