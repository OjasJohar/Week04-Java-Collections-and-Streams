package finally_block_execution;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlockExecution_07 {
    public static void divisionOperation(int a,int b){
        try{
            int div=a/b;
            System.out.println("Answer(" + a+ "/" + b +") : " +div);

        }catch(ArithmeticException e){
            System.out.println("Invalid Operation: Divide by Zero.");
        }finally {
            System.out.println("Operation Completed.");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int a = input.nextInt();

            System.out.println("Enter second number: ");
            int b = input.nextInt();
            divisionOperation(a,b);
        }catch (InputMismatchException e) {
            System.out.println("Input mismatch: user enter non-numeric value.");
        }
    }
}
