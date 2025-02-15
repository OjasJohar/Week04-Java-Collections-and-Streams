package custom_exception;

import java.util.Scanner;

public class CustomException_03 {
    public static void validateAge(int age){
        try{
            if(age>=18){
                System.out.println("Access granted");
            }else{
                throw new InvalidAgeException("Age must be 18 or above");
            }
        }catch (InvalidAgeException e){
            System.out.println( e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=scn.nextInt();
        validateAge(age);
    }
}
