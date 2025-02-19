package reflection.intermediate_level.retrieve_annotations_at_runtime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Step 1: Define the custom annotation @Author
@Retention(RetentionPolicy.RUNTIME) // Retain at runtime
@Target(ElementType.TYPE) // Applicable to classes
public @interface Author {
    String name();
}