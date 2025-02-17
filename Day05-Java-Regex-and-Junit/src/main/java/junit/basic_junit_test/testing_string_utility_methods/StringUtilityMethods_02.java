package junit.basic_junit_test.testing_string_utility_methods;

import java.util.Scanner;

public class StringUtilityMethods_02 {

    public static void main(String[] args) {
        StringUtilityMethods_02 obj=new StringUtilityMethods_02();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.next();

        System.out.println("Reverse String :"+obj.reverse(str));
        System.out.println("Is Palindrome  :"+obj.isPalindrome(str));
        System.out.println("To Uppercase   :"+obj.toUpperCase(str));
        sc.close();
    }
    public String reverse(String str){
        String temp="";
        for(int i=str.length()-1;i>=0; i--){
            temp += str.charAt(i);
        }
        return temp;
    }
    public boolean isPalindrome(String str){
        int n=str.length()-1;
        int i=0;
        while(i<n){
            if(str.charAt(i)!=str.charAt(n)){
                return false;
            }
            n--;
            i++;
        }
        return true;
    }
    public String toUpperCase(String str){
        return str.toUpperCase();
    }
}
