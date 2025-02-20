package annotations.practiceproblems.intermediatelevel.annotationforfieldvalidation;
import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

public class User {
    @MaxLength(10) // Restricting username to max 10 characters
    private String username;


    public User(String username) {
        validateMaxLength(username);
        this.username = username;
    }


    private void validateMaxLength(String username) {
        try {
            Field field = User.class.getDeclaredField("username");
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength maxLength = field.getAnnotation(MaxLength.class);
                if (username.length() > maxLength.value()) {
                    throw new IllegalArgumentException("Username exceeds maximum length of " + maxLength.value());
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }
}
