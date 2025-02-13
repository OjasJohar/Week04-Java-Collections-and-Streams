package queue_interface.hospital_triage_system;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HospitalTriageSystem_03 {

    public static void main(String[] args) {
        // Custom comparator to prioritize higher severity
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>(
                Comparator.comparingInt((Patient p) -> -p.severity) // Higher severity first
        );
        // Adding patients to the queue
        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));

        // Processing patients based on severity
        System.out.println("Order of treatment:");
        while (!triageQueue.isEmpty()) {
            Patient patient = triageQueue.poll();
            System.out.println(patient.name + " (Severity: " + patient.severity + ")");
        }
    }
}
