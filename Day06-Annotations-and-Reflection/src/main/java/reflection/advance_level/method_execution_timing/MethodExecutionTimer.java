package reflection.advance_level.method_execution_timing;

import java.lang.reflect.Method;

public class MethodExecutionTimer {
    public static void measureExecutionTime(Object obj, String methodName) {
        try {
            Method method = obj.getClass().getMethod(methodName);
            long startTime = System.nanoTime(); // Start time measurement
            method.invoke(obj);
            long endTime = System.nanoTime(); // End time measurement

            long duration = endTime - startTime; // Time in nanoseconds
            System.out.println("Execution time of " + methodName + ": " + duration + " nanoseconds");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SampleClass sample = new SampleClass();
        measureExecutionTime(sample, "fastMethod");
        measureExecutionTime(sample, "slowMethod");
    }
}