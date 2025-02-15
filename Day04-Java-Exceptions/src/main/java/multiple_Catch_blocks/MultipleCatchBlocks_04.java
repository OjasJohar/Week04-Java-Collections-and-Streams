package multiple_Catch_blocks;

import java.util.Scanner;

public class MultipleCatchBlocks_04 {
    public static void printArrayValue(int[] arr, int index){
        try{
            int value=arr[index];
            System.out.println("Value at index " + index + ": " + value);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index!");
        }catch (NullPointerException e){
            System.out.println("Array is not initialized!");
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[5];

        System.out.println("Enter the 5 elements:");
        for (int i=0;i<5;i++){
            arr[i]=input.nextInt();
        }

        System.out.println("Enter index number: ");
        int index=input.nextInt();
        printArrayValue(arr,index);
    }
}
