package reflection_test.intermediate_level_test.access_and_modify_static_fields;

import org.junit.jupiter.api.Test;
import reflection.intermediate_level.access_and_modify_static_fields.Configuration;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConfigurationReflection_07 {
    @Test
    void testAccessAndModifyStaticField() throws Exception {
        // Given
        Configuration configuration = new Configuration("initialAPIKey123");
        Class<?> cls = configuration.getClass();

        // Accessing the static field "API_KEY"
        Field field = cls.getDeclaredField("API_KEY");
        field.setAccessible(true);

        // Verify the old value of API_KEY
        String oldValue = (String) field.get(configuration);
        assertEquals("initialAPIKey123", oldValue, "Old API_KEY should match initial value");

        // Modify the static field
        field.set(configuration, "modifiedAPIKey456");

        // Verify the new value of API_KEY
        String newValue = (String) field.get(configuration);
        assertEquals("modifiedAPIKey456", newValue, "New API_KEY should be modified");
    }

}
