package serializationtest;

import org.junit.jupiter.api.Test;
import serialization.Employee;
import serialization.EmployeeSerialization_04;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeSerialization_04_Test {

    @Test
    public void testFileCreatedAfterSave() {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "HR", 50000),
                new Employee(2, "Bob", "IT", 60000)
        );
        EmployeeSerialization_04.saveEmployees(employees);
        File file = new File("employees.dat");
        assertTrue(file.exists()); // Check if file is created
    }

    @Test
    public void testEmployeeDataIntegrity() {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "HR", 50000),
                new Employee(2, "Bob", "IT", 60000)
        );
        EmployeeSerialization_04.saveEmployees(employees);
        List<Employee> loadedEmployees = EmployeeSerialization_04.loadEmployees();
        assertEquals(employees.size(), loadedEmployees.size()); // Check if size matches
        assertEquals(employees.get(0).name, loadedEmployees.get(0).name); // Check first employee
        assertEquals(employees.get(1).department, loadedEmployees.get(1).department); // Check second employee
    }
}