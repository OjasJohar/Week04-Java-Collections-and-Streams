package reflection.advance_level.object_mapper;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapper_08 {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            T instance = clazz.getDeclaredConstructor().newInstance();
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                try {
                    Field field = clazz.getDeclaredField(entry.getKey());
                    field.setAccessible(true);
                    field.set(instance, entry.getValue());
                } catch (NoSuchFieldException e) {
                    // Ignore fields that do not exist in the class
                }
            }
            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Failed to map properties to object", e);
        }
    }

    public static void main(String[] args) {

        Map<String, Object> properties = Map.of(
                "name", "Ojas Johar",
                "age", 20
        );

        Person person = toObject(Person.class, properties);
        System.out.println(person);
    }
}

