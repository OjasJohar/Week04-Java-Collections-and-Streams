package junit_test.advanced_junit_problems.testing_user_registration;
import junit.advanced_junit_problems.testing_user_registration.UserRegistration_05;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestingUserRegistration_05 {
    private UserRegistration_05 userRegistration;

    @BeforeEach
    void setUp() {
        userRegistration = new UserRegistration_05();
    }

    @Test
    void testValidUserRegistration() {
        assertDoesNotThrow(() -> userRegistration.registerUser("JohnDoe", "john.doe@example.com", "securePass123"));
    }

    @Test
    void testInvalidUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> userRegistration.registerUser("", "john.doe@example.com", "securePass123"));
        assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> userRegistration.registerUser("JohnDoe", "invalid-email", "securePass123"));
        assertEquals("Invalid email format", exception.getMessage());
    }

    @Test
    void testShortPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> userRegistration.registerUser("JohnDoe", "john.doe@example.com", "123"));
        assertEquals("Password must be at least 6 characters long", exception.getMessage());
    }
}
