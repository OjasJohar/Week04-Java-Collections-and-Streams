package junit.basic_junit_test.testing_a_calculator_class;

import java.util.Scanner;

public class CalculatorClass_01 {

    public static void main(String[] args) {
        CalculatorClass_01 obj=new CalculatorClass_01();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers :");
        System.out.print("1 :");
        int a=sc.nextInt();
        System.out.print("2 :");
        int b=sc.nextInt();

        System.out.println("Decide the operation :");
        System.out.print("Enter 1 to Add, ");
        System.out.print("2 to Subtract, ");
        System.out.print("3 to Multiply, ");
        System.out.println("4 to Divide.");
        int op=sc.nextInt();

        switch (op){
            case 1->{
                int res= obj.add(a,b);
                System.out.println(a+" + "+b+" = "+res);
            }
            case 2->{
                int res= obj.subtract(a,b);;
                System.out.println(a+" - "+b+" = "+res);
            }
            case 3->{
                int res= obj.multiply(a,b);;
                System.out.println(a+" * "+b+" = "+res);
            }
            case 4->{
                int res= obj.divide(a,b);
                System.out.println(a+" / "+b+" = "+res);
            }
            default -> System.out.println("Enter valid number.");
        }
        sc.close();
    }
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b) throws ArithmeticException{
        int res=0;
        try {
            res=a/b;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Enter valid input");
            throw e;
        }
        return res;
    }
}