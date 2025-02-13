package map_interface.insurance_policy_management_system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Test_PolicyManagementSystem {
    private InsurancePolicyManager manager;
    private InsurancePolicy policy1, policy2, policy3;

    @BeforeEach
    void setUp() {
        manager = new InsurancePolicyManager();

        policy1 = new InsurancePolicy("P123", "John Doe", LocalDate.now().plusDays(10));
        policy2 = new InsurancePolicy("P456", "Jane Smith", LocalDate.now().plusDays(5));
        policy3 = new InsurancePolicy("P789", "John Doe", LocalDate.now().minusDays(2));

        manager.addPolicy(policy1);
        manager.addPolicy(policy2);
        manager.addPolicy(policy3);
    }

    @Test
    void testGetPolicyByNumber() {
        assertEquals(policy1, manager.getPolicyByNumber("P123"));
        assertNull(manager.getPolicyByNumber("P999"));
    }

    @Test
    void testGetPoliciesExpiringSoon() {
        List<InsurancePolicy> expiringPolicies = manager.getPoliciesExpiringSoon(7);
        assertEquals(2, expiringPolicies.size());
        assertTrue(expiringPolicies.contains(policy2));
    }

    @Test
    void testGetPoliciesByHolder() {
        List<InsurancePolicy> policies = manager.getPoliciesByHolder("John Doe");
        assertEquals(2, policies.size());
        assertTrue(policies.contains(policy1));
        assertTrue(policies.contains(policy3));
    }

    @Test
    void testRemoveExpiredPolicies() {
        manager.removeExpiredPolicies();
        assertNull(manager.getPolicyByNumber("P789"));
        assertEquals(1, manager.getPoliciesByHolder("John Doe").size());
    }

}
