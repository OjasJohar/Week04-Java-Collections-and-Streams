package junit_test.basic_junit_test.testing_beforeeach_and_aftereach_annotations;

import junit.basic_junit_test.testing_beforeeach_and_aftereach_annotations.DatabaseConnection_05;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestingDatabaseConnection_05 {
    private DatabaseConnection_05 dbConnection;

    @BeforeEach
    void setUp() {
        dbConnection = new DatabaseConnection_05();
        dbConnection.connect();
    }
    @AfterEach
    void tearDown() {
        dbConnection.disconnect();
        System.out.println("----------------");
    }

    @Test
    void testConnectionEstablished() {
        System.out.println("Checking...");
        assertTrue(dbConnection.isConnected(), "Connection should be established.");
        System.out.println("Connected.");
    }

    @Test
    void testConnectionClosed() {
        System.out.println("Checking...");
        dbConnection.disconnect();
        assertFalse(dbConnection.isConnected(), "Connection should be closed.");
    }
}
