package annotations.practiceproblems.intermediatelevel.LoggingMethodTime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LogExecutionTime {
    // Optional attributes with default values
    String message() default "Method executed in: ";
}
