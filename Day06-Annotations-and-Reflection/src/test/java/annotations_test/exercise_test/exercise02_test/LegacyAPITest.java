package annotations_test.exercise_test.exercise02_test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import annotations.exercise.exercise02.*;

class LegacyAPITest {

    @Test
    void testOldFeature() {
        LegacyAPI api = new LegacyAPI();

        // Checking if calling the deprecated method does not throw an error
        assertDoesNotThrow(api::oldFeature, "Deprecated method should still execute without errors");
    }

    @Test
    void testNewFeature() {
        LegacyAPI api = new LegacyAPI();

        // Checking if new method executes properly
        assertDoesNotThrow(api::newFeature, "New method should execute without errors");
    }
}
