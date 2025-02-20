package annotations.practiceproblems.advancelevel.customserializationannotation;

public class JsonSerialization {
    public static void main(String[] args) {
        User user1 = new User("Ojas Johar", 22, "ojas@example.com");
        User user2 = new User("", ""); // Edge case

        try {
            String json1 = JsonSerializer.serialize(user1);
            System.out.println("Serialized JSON: " + json1);


            String json2 = JsonSerializer.serialize(user2);
            System.out.println("Serialized JSON: " + json2);


        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
