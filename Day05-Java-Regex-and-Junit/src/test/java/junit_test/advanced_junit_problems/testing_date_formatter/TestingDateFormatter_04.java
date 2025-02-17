package junit_test.advanced_junit_problems.testing_date_formatter;
import junit.advanced_junit_problems.testing_date_formatter.DateFormatter_04;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestingDateFormatter_04 {
    @Test
    void testValidDate() {
        assertEquals("15-02-2025", DateFormatter_04.formatDate("2025-02-15"));
        assertEquals("01-01-2000", DateFormatter_04.formatDate("2000-01-01"));
    }

    @Test
    void testInvalidDateFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter_04.formatDate("15-02-2025");
        });
        assertEquals("Invalid date format. Expected yyyy-MM-dd.", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter_04.formatDate("2025/02/15");
        });
        assertEquals("Invalid date format. Expected yyyy-MM-dd.", exception.getMessage());
    }
}
