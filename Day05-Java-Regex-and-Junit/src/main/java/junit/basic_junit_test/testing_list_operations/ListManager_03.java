package junit.basic_junit_test.testing_list_operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListManager_03 {

    public static void main(String[] args) {
        ListManager_03 obj=new ListManager_03();
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list);

        obj.addElement(list, 6);
        System.out.println(list);
        obj.removeElement(list, 3);
        System.out.println(list);
        System.out.println("Size :"+obj.getSize(list));
    }
    public void addElement(List<Integer> list, int element){
        list.add(element);
    }
    public void removeElement(List<Integer> list, int element){
        for(int i=0; i<list.size(); i++){
            if(list.get(i)==element){
                list.remove(i);
                return;
            }
        }
    }
    public int getSize(List<Integer> list){
        return list.size();
    }
}
