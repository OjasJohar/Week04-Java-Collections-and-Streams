package junit.basic_junit_test.testing_parameterized_tests;

import java.util.Scanner;

public class ParameterizedTests_06 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int number=sc.nextInt();

        boolean res=isEven(number);
        if(res)
            System.out.println("Number "+number+" is even.");
        else
            System.out.println("Number "+number+" is odd.");
    }
    public static boolean isEven(int number){
        return (number%2==0);
    }
}
