package reflection.advance_level.method_execution_timing;

public class SampleClass {
    public void fastMethod() {
        System.out.println("Fast method executing...");
    }

    public void slowMethod() {
        System.out.println("Slow method executing...");
        try {
            Thread.sleep(1000); // Simulating delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}