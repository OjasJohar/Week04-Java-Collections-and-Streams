package queue_interface.hospital_triage_system;

import org.junit.jupiter.api.Test;
import java.util.Comparator;
import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_HospitalTriageSystem_03 {
    @Test
    void testTriageOrder() {
        // Custom comparator to prioritize higher severity
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>(
                Comparator.comparingInt((Patient p) -> -p.severity) // Higher severity first
        );

        // Adding patients to the queue
        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));

        // Checking order of treatment
        assertEquals("Alice", triageQueue.poll().name); // Highest severity
        assertEquals("John", triageQueue.poll().name);
        assertEquals("Bob", triageQueue.poll().name); // Lowest severity
    }
}
