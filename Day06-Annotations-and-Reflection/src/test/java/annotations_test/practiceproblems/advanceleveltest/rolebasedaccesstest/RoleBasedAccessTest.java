package annotations_test.practiceproblems.advanceleveltest.rolebasedaccesstest;

import annotations.practiceproblems.advancelevel.rolebasedclasslevelannotation.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class RoleBasedAccessTest {

    private String captureOutput(Runnable action) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            action.run();
        } finally {
            System.setOut(originalOut);
        }

        return outputStream.toString().trim();
    }

    @Test
    void testAdminAccess() {
        Service service = new Service();
        String output = captureOutput(() -> AccessManager.checkAccess(service, "performAdminTask", "ADMIN"));
        assertEquals("Admin task executed successfully!", output);
    }

    @Test
    void testUserAccessDeniedForAdminTask() {
        Service service = new Service();
        String output = captureOutput(() -> AccessManager.checkAccess(service, "performAdminTask", "USER"));
        assertEquals("Access Denied! USER is not allowed to execute performAdminTask", output);
    }

    @Test
    void testUserAccessForUserTask() {
        Service service = new Service();
        String output = captureOutput(() -> AccessManager.checkAccess(service, "performUserTask", "USER"));
        assertEquals("User task executed successfully!", output);
    }

    @Test
    void testGuestAccessDeniedForUserTask() {
        Service service = new Service();
        String output = captureOutput(() -> AccessManager.checkAccess(service, "performUserTask", "GUEST"));
        assertEquals("Access Denied! GUEST is not allowed to execute performUserTask", output);
    }

    @Test
    void testPublicTaskAccessibleToAnyone() {
        Service service = new Service();
        String output = captureOutput(() -> AccessManager.checkAccess(service, "publicTask", "GUEST"));
        String expected = "No Role Restriction: Executing publicTask" + System.lineSeparator() + "Public task executed successfully!";
        assertEquals(expected, output);
    }

}