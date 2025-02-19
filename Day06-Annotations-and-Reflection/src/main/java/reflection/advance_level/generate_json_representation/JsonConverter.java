package reflection.advance_level.generate_json_representation;

import java.lang.reflect.Field;

public class JsonConverter {
    public static String toJson(Object obj) {
        if (obj == null) {
            return "null";
        }
        StringBuilder json = new StringBuilder("{");
        Field[] fields = obj.getClass().getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            try {
                json.append("\"").append(fields[i].getName()).append("\":");
                Object value = fields[i].get(obj);
                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }
                if (i < fields.length - 1) {
                    json.append(", ");
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) {
        Person person = new Person("Alice", 30, true);
        System.out.println(JsonConverter.toJson(person));
    }
}
