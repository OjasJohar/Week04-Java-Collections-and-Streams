package annotations.practiceproblems.advancelevel.customcacheingsystem;
public class Computation {

    @CacheResult
    public int computeFactorial(int n) {
        if (CacheManager.containsKey("factorial-" + n)) {
            System.out.println("Fetching cached result for: " + n);
            return (int) CacheManager.get("factorial-" + n);
        }

        System.out.println("Computing factorial for: " + n);
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        CacheManager.put("factorial-" + n, result); // Store result in cache
        return result;
    }
}
