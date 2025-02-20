package annotations_test.practiceproblems.advanceleveltest.customserializationtest;
import annotations.practiceproblems.advancelevel.customserializationannotation.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomSerializationTest {
    @Test
    void testJsonSerialization() throws IllegalAccessException {
        User user1 = new User("JohnDoe", 20,"john@example.com");
        String expectedJson = "{\"user_email\":\"john@example.com\",\"user_name\":\"JohnDoe\",\"user_age\":\"20\"}";
        assertEquals(expectedJson, JsonSerializer.serialize(user1));
    }

    @Test
    void testEmptyUserSerialization() throws IllegalAccessException {
        User user2 = new User("","");
        String expectedJson = "{\"user_email\":\"\",\"user_name\":\"\",\"user_age\":\"\"}";
        assertEquals(expectedJson, JsonSerializer.serialize(user2));
    }
}
