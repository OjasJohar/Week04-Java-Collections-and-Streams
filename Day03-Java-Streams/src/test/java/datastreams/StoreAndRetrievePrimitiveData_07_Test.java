package datastreams;
import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoreAndRetrievePrimitiveData_07_Test {

    @Test
    public void testFileCreated() {
        StoreAndRetrievePrimitiveData_07.saveStudent(101, "OJAS", 9.8);
        File file = new File("students.dat");
        assertTrue(file.exists()); // Check if file is created
    }

    @Test
    public void testReadStudentDoesNotThrowException() {
        StoreAndRetrievePrimitiveData_07.saveStudent(101, "OJAS", 9.8);
        StoreAndRetrievePrimitiveData_07.readStudent();
    }
}
