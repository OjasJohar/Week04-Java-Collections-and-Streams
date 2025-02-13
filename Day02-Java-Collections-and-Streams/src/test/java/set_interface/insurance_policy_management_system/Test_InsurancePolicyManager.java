package set_interface.insurance_policy_management_system;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class Test_InsurancePolicyManager{
    private InsurancePolicyManager manager;

    @BeforeEach
    void setUp() {
        manager = new InsurancePolicyManager();
        Calendar cal = Calendar.getInstance();

        cal.set(2025, Calendar.MARCH, 10);
        manager.addPolicy(new InsurancePolicy(1001, "John Doe", cal.getTime(), "Health", 5000));

        cal.set(2025, Calendar.FEBRUARY, 20);
        manager.addPolicy(new InsurancePolicy(1002, "Jane Smith", cal.getTime(), "Auto", 3000));

        cal.set(2025, Calendar.MARCH, 5);
        manager.addPolicy(new InsurancePolicy(1003, "Alice Brown", cal.getTime(), "Home", 4500));
    }

    @Test
    void testAddPolicy() {
        Calendar cal = Calendar.getInstance();
        cal.set(2025, Calendar.APRIL, 15);
        InsurancePolicy policy = new InsurancePolicy(1004, "Bob White", cal.getTime(), "Health", 4000);

        manager.addPolicy(policy);

        assertTrue(manager.hashSet.contains(policy));
        assertTrue(manager.linkedHashSet.contains(policy));
        assertTrue(manager.treeSet.contains(policy));
    }

    @Test
    void testDisplaySpecificCoveragePolicies() {
        assertDoesNotThrow(() -> manager.displaySpecificCoveragePolicies("Health"));
    }

    @Test
    void testDisplayDuplicatePolicies() {
        InsurancePolicy duplicatePolicy = new InsurancePolicy(1001, "John Doe", new Date(), "Health", 5000);
        manager.addPolicy(duplicatePolicy);
        assertDoesNotThrow(manager::displayDuplicatePolicies);
    }

    @Test
    void testDisplayExpiringPolicies() {
        assertDoesNotThrow(manager::displayExpiringPolicies);
    }
}
