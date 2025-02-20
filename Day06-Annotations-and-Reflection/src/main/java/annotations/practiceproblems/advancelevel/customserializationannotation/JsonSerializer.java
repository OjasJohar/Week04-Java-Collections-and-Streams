package annotations.practiceproblems.advancelevel.customserializationannotation;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class JsonSerializer {
    public static String serialize(Object obj) throws IllegalAccessException {
        Map<String, String> jsonMap = new HashMap<>();
        Class<?> objClass = obj.getClass();

        for (Field field : objClass.getDeclaredFields()) {
            field.setAccessible(true);

            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField annotation = field.getAnnotation(JsonField.class);
                Object value = field.get(obj); // Get field value

                // Handle null values safely
                jsonMap.put(annotation.name(), value != null ? value.toString() : "");
            }
        }

        // Build JSON String
        StringBuilder jsonBuilder = new StringBuilder("{");
        for (Map.Entry<String, String> entry : jsonMap.entrySet()) {
            jsonBuilder.append("\"").append(entry.getKey()).append("\":\"")
                    .append(entry.getValue()).append("\",");
        }

        // Remove last comma to maintain valid JSON format
        if (!jsonMap.isEmpty()) {
            jsonBuilder.setLength(jsonBuilder.length() - 1);
        }
        jsonBuilder.append("}");

        return jsonBuilder.toString();
    }
}
