package junit.basic_junit_test.testing_exception_handling;

import java.util.Scanner;

public class ExceptionHandling_04 {

    public static void main(String[] args) {
        ExceptionHandling_04 obj=new ExceptionHandling_04();
        Scanner sc=new Scanner(System.in);
        System.out.print("1 :");
        int a=sc.nextInt();
        System.out.print("2 :");
        int b= sc.nextInt();

        int res=obj.divide(a,b);
        System.out.println(a+" / "+b+" = "+res);
    }
    public int divide(int a, int b) throws ArithmeticException{
        try{
            int res=a/b;
            return res;
        } catch (ArithmeticException e){
            System.out.println("Exception caught");
            throw e;
        }
    }
}
