package annotations.practiceproblems.advancelevel.rolebasedclasslevelannotation;
import java.lang.annotation.*;

// Define @RoleAllowed annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

public class Service {
    @RoleAllowed("ADMIN")
    public void performAdminTask() {
        System.out.println("Admin task executed successfully!");
    }

    @RoleAllowed("USER")
    public void performUserTask() {
        System.out.println("User task executed successfully!");
    }

    public void publicTask() { // No restriction
        System.out.println("Public task executed successfully!");
    }
}
