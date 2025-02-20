package annotations.practiceproblems.advancelevel.customcacheingsystem;

public class CacheExecute {
    public static void main(String[] args) {
        Computation computation = new Computation();

        // First computation
        System.out.println("Result: " + computation.computeFactorial(5));

        // Second computation
        System.out.println("Result: " + computation.computeFactorial(5));

        // Different input
        System.out.println("Result: " + computation.computeFactorial(6));
    }
}
