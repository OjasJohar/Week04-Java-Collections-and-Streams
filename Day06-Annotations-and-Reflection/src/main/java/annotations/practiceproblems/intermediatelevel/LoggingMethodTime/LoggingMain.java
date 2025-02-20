package annotations.practiceproblems.intermediatelevel.LoggingMethodTime;
import java.lang.reflect.Method;
public class LoggingMain {
    public static void main(String[] args) throws Exception {
        LoggingAnnotation service = new LoggingAnnotation();
        Method method = service.getClass().getMethod("processData");


        if (method.isAnnotationPresent(LogExecutionTime.class)) {
            LogExecutionTime annotation = method.getAnnotation(LogExecutionTime.class);
            long startTime = System.nanoTime();
            service.processData();
            long endTime = System.nanoTime();
            System.out.println(annotation.message() + (endTime - startTime)/1000 + "ms");
        }
}
}
