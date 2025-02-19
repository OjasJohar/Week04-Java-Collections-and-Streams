package reflection.intermediate_level.dynamic_method_invocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvocation_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter method name (add, subtract, multiply): ");
        String methodName = scanner.next();

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        try {
            MathOperations mathOps = new MathOperations();
            Method method = MathOperations.class.getMethod(methodName, int.class, int.class);
            int result = (int) method.invoke(mathOps, num1, num2);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}
