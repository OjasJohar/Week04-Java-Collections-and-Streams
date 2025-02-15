package unchecked_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException_02 {
    public static void divideTwoNumbers(int a, int b) {
        try {

            int div=(a/b);
            System.out.println("Answer(" + a+ "/" + b +") : " +div);

        } catch (ArithmeticException e) {
            System.out.println("Invalid operation: Divide by zero.");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int a = input.nextInt();

            System.out.println("Enter second number: ");
            int b = input.nextInt();
            divideTwoNumbers(a, b);
        }catch (InputMismatchException e) {
            System.out.println("Input mismatch: user enter non-numeric value.");
        }
    }
}
