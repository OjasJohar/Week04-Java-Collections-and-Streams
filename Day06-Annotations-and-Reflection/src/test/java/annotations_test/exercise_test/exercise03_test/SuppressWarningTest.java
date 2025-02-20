package annotations_test.exercise_test.exercise03_test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class SuppressWarningTest {

    @Test
    void testListOperations() {
        @SuppressWarnings("unchecked")
        ArrayList list = new ArrayList<>();

        // Adding mixed data types
        list.add(10);
        list.add("Hello");
        list.add(30);

        // Ensuring list contains correct elements
        assertEquals(3, list.size(), "List should have 3 elements");
        assertEquals(10, list.get(0), "First element should be 10");
        assertEquals("Hello", list.get(1), "Second element should be 'Hello'");
        assertEquals(30, list.get(2), "Third element should be 30");
    }
}
