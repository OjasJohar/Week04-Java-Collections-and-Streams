package list_interface.remove_duplicates_while_preserving_order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates_04 {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));
        System.out.println(list);

        list=removeDuplicates(list);
        System.out.println(list);
    }

    public static List<Integer> removeDuplicates(List<Integer> list){
        List<Integer> temp=new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            if(!temp.contains(list.get(i))){
                temp.add(list.get(i));
            }
        }
        return temp;
    }
}
