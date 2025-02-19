package reflection_test.advance_level_test.dependency_injection_using_reflection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import reflection.advance_level.dependency_injection_using_reflection.*;

// Test class for DIContainer
class DIContainerTest {
    private DIContainer diContainer;

    @BeforeEach
    void setUp() {
        diContainer = new DIContainer();
    }

    @Test
    void testDependencyInjection() throws Exception {
        // Register services
        diContainer.register(ServiceA.class);
        diContainer.register(ServiceB.class);

        // Retrieve instances
        ServiceA serviceA = diContainer.getInstance(ServiceA.class);
        ServiceB serviceB = diContainer.getInstance(ServiceB.class);

        // Assertions
        assertNotNull(serviceA, "ServiceA should be created");
        assertNotNull(serviceB, "ServiceB should be created");
    }

    @Test
    void testUnregisteredDependencyReturnsNull() {
        ServiceA serviceA = diContainer.getInstance(ServiceA.class);
        assertNull(serviceA, "Unregistered dependencies should return null");
    }
}