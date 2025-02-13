package map_interface.insurance_policy_management_system;

import java.time.LocalDate;

public class PolicyManagementSystem {
    public static void main(String[] args) {
        InsurancePolicyManager system = new InsurancePolicyManager();

        system.addPolicy(new InsurancePolicy("P123", "Alice", LocalDate.now().plusDays(10)));
        system.addPolicy(new InsurancePolicy("P124", "Bob", LocalDate.now().plusDays(5)));
        system.addPolicy(new InsurancePolicy("P125", "Alice", LocalDate.now().plusDays(40)));
        system.addPolicy(new InsurancePolicy("P126", "Charlie", LocalDate.now().minusDays(1)));

        System.out.println("All Policies:");
        system.displayAllPolicies();

        System.out.println("\nPolicies expiring within 30 days:");
        for (InsurancePolicy policy : system.getPoliciesExpiringSoon(30)) {
            System.out.println(policy);
        }

        System.out.println("\nPolicies for Alice:");
        for (InsurancePolicy policy : system.getPoliciesByHolder("Alice")) {
            System.out.println(policy);
        }

        System.out.println("\nRemoving expired policies...");
        system.removeExpiredPolicies();
        system.displayAllPolicies();
    }
}
