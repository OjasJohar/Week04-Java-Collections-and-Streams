package map_interface.insurance_policy_management_system;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManager {
    private Map<String, InsurancePolicy> policyMap = new HashMap<>();
    private LinkedHashMap<String, InsurancePolicy> orderedPolicyMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, InsurancePolicy> sortedByExpiryMap = new TreeMap<>();

    public void addPolicy(InsurancePolicy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        orderedPolicyMap.put(policy.getPolicyNumber(), policy);
        sortedByExpiryMap.put(policy.getExpiryDate(), policy);
    }

    public InsurancePolicy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    public List<InsurancePolicy> getPoliciesExpiringSoon(int days) {
        List<InsurancePolicy> expiringPolicies = new ArrayList<>();
        LocalDate thresholdDate = LocalDate.now().plusDays(days);
        for (Map.Entry<LocalDate, InsurancePolicy> entry : sortedByExpiryMap.entrySet()) {
            if (entry.getKey().isBefore(thresholdDate)) {
                expiringPolicies.add(entry.getValue());
            } else {
                break;
            }
        }
        return expiringPolicies;
    }

    public List<InsurancePolicy> getPoliciesByHolder(String policyholderName) {
        List<InsurancePolicy> policies = new ArrayList<>();
        for (InsurancePolicy policy : policyMap.values()) {
            if (policy.getPolicyholderName().equalsIgnoreCase(policyholderName)) {
                policies.add(policy);
            }
        }
        return policies;
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        Iterator<Map.Entry<LocalDate, InsurancePolicy>> iterator = sortedByExpiryMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<LocalDate, InsurancePolicy> entry = iterator.next();
            if (entry.getKey().isBefore(today)) {
                policyMap.remove(entry.getValue().getPolicyNumber());
                orderedPolicyMap.remove(entry.getValue().getPolicyNumber());
                iterator.remove();
            } else {
                break;
            }
        }
    }

    public void displayAllPolicies() {
        for (InsurancePolicy policy : orderedPolicyMap.values()) {
            System.out.println(policy);
        }
    }
}
