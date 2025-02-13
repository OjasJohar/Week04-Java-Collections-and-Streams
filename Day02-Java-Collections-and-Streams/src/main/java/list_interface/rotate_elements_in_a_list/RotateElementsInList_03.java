package list_interface.rotate_elements_in_a_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RotateElementsInList_03 {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the index to rotate :");
        int r=sc.nextInt();

        List<Integer> rotatedList=rotateList(list, r);
        System.out.println("Rotated List :"+rotatedList);
    }

    public static List<Integer> rotateList(List<Integer> list, int r){

        List<Integer> rotatedList=new ArrayList<>();

        if(r< list.size()){
            for(int i=r; i<list.size(); i++){
                rotatedList.add(list.get(i));
            }
            for(int i=0; i<r; i++){
                rotatedList.add(list.get(i));
            }
        }
        else
            System.out.println("Enter Valid Index.");

        return rotatedList;
    }
}
