package annotations.exercise.exercise05;
import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}


public class TaskBug {
    @BugReport(description = "Null pointer exception occurs when input is null")
    @BugReport(description = "InputMismatchException occurs when wrong type of input is given")
    public void checkReport() {
        System.out.println("Program execution");
    }
}

