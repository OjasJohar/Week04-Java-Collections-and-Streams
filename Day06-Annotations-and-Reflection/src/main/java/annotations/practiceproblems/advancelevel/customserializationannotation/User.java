package annotations.practiceproblems.advancelevel.customserializationannotation;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

public class User {
    @JsonField(name = "user_name")
    private String name;

    @JsonField(name = "user_age")
    private Integer age;

    @JsonField(name = "user_email")
    private String email;
    public User(String name, String email){
        this.name = name;
        this.age = null;
        this.email = email;
    }

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}
