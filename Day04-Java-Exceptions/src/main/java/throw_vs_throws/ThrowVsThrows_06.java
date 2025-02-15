package throw_vs_throws;

import java.util.Scanner;

public class ThrowVsThrows_06 {
    public static double calculateInterest(double principle, double rate, int years)
            throws IllegalArgumentException {
        if (principle < 0 || rate < 0 || years <0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        return (principle * rate * years) / 100;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principle:");
        double principle = input.nextDouble();

        System.out.println("Enter the rate:");
        double rate = input.nextDouble();

        System.out.println("Enter the time:");
        int years = input.nextInt();

        try {
            double si = calculateInterest(principle, rate, years);
            System.out.println("Simple Interest : " + si);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
