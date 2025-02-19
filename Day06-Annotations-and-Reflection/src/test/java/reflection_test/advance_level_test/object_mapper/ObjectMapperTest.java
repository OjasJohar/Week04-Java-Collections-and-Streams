package reflection_test.advance_level_test.object_mapper;
import reflection.advance_level.object_mapper.*;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ObjectMapperTest {

    @Test
    void testObjectMappingWithValidProperties() {
        // Given a properties map
        Map<String, Object> properties = Map.of(
                "name", "Ojas Johar",
                "age", 20
        );

        // When mapping to a Person object
        Person person = ObjectMapper_08.toObject(Person.class, properties);

        // Then verify the fields were correctly set
        assertNotNull(person, "Person object should not be null");
        assertEquals("Ojas Johar", person.getName(), "Name should be mapped correctly");
        assertEquals(20, person.getAge(), "Age should be mapped correctly");
    }

    @Test
    void testObjectMappingWithExtraProperties() {
        // Given a properties map with an extra field not present in the class
        Map<String, Object> properties = Map.of(
                "name", "Jane Doe",
                "age", 25,
                "nonExistentField", "ignored"
        );

        // When mapping to a Person object
        Person person = ObjectMapper_08.toObject(Person.class, properties);

        // Then verify the valid fields were set and the extra field was ignored
        assertNotNull(person);
        assertEquals("Jane Doe", person.getName());
        assertEquals(25, person.getAge());
    }

    @Test
    void testObjectMappingWithMissingProperties() {
        // Given a properties map missing some fields
        Map<String, Object> properties = Map.of("name", "Alice");

        // When mapping to a Person object
        Person person = ObjectMapper_08.toObject(Person.class, properties);

        // Then verify name is set and age remains default (0 for int)
        assertNotNull(person);
        assertEquals("Alice", person.getName());
        assertEquals(0, person.getAge(), "Age should have the default value (0)");
    }

    @Test
    void testObjectMappingWithNullProperties() {
        // When passing null as properties map
        Exception exception = assertThrows(RuntimeException.class, () -> ObjectMapper_08.toObject(Person.class, null));

        // Then verify the correct exception is thrown
        assertTrue(exception.getMessage().contains("Failed to map properties to object"));
    }
}
