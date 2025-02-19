package reflection_test.advance_level_test.generate_json_representation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import reflection.advance_level.generate_json_representation.*;

class JsonConverterTest {

    @Test
    void testJsonConversionWithValidObject() {
        // Create a sample object
        Person person = new Person("Alice", 30, true);

        // Convert to JSON
        String json = JsonConverter.toJson(person);

        // Expected JSON string
        String expectedJson = "{\"name\":\"Alice\", \"age\":30, \"isEmployed\":true}";

        // Validate JSON format and content
        assertNotNull(json, "JSON should not be null");
        assertEquals(expectedJson.replace(" ", ""), json.replace(" ", ""), "JSON representation should match expected format");
    }

    @Test
    void testJsonConversionWithNullObject() {
        String json = JsonConverter.toJson(null);
        assertEquals("null", json, "JSON should be 'null' for null object");
    }
}
