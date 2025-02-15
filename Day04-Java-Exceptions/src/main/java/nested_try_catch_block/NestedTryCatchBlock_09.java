package nested_try_catch_block;

import java.util.Scanner;

public class NestedTryCatchBlock_09 {
    public static void divisionInArray(int[] arr, int divisor, int index) {
        try {
            int value = arr[index];
            try {
                int result = value / divisor;
                System.out.println("Division result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter the 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the divisor :");
        int divisor = input.nextInt();

        System.out.println("Enter the index number:");
        int index = input.nextInt();

        divisionInArray(arr, divisor, index);
    }
}
