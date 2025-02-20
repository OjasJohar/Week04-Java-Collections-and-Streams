package annotations.exercise.exercise05;

import java.lang.reflect.Method;

public class RepeatableAnnotationExample {
    public static void main(String[] args) {
        try {
            // Get the method where the annotation is applied
            Method method = TaskBug.class.getMethod("checkReport");

            // Retrieve all @BugReport annotations
            BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);

            // Print each bug report description
            for (BugReport bug : bugReports) {
                System.out.println("Bug Report: " + bug.description());
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
