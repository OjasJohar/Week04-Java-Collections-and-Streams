package annotations.practiceproblems.intermediatelevel.LoggingMethodTime;
import java.lang.annotation.*;

public class LoggingAnnotation {
    @LogExecutionTime(message = "Time taken: ")
    public void processData() {
        System.out.println("Process executing");
    }
}

