package annotations_test.practiceproblems.basiclevelproblem.todoannotation;
import annotations.practiceproblems.beginnerlevel.todoannotation.*;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

public class TodoAnnotationTest {
    @Test
    void testTask1Annotation() throws NoSuchMethodException {
        Method method = TodoTask.class.getMethod("task1");

        assertTrue(method.isAnnotationPresent(Todo.class), "Annotation should be present");

        Todo annotation = method.getAnnotation(Todo.class);
        assertEquals("Requirement gathering", annotation.task(), "Task should be Requirement gathering");
        assertEquals("Sejal chauhan", annotation.assignedTo(), "AssignedTo should be Sejal chauhan");
        assertEquals("High", annotation.priority(), "Priority should be High");
    }

    @Test
    void testTask5Annotation() throws NoSuchMethodException {
        Method method = TodoTask.class.getMethod("task5");

        assertTrue(method.isAnnotationPresent(Todo.class), "Annotation should be present");

        Todo annotation = method.getAnnotation(Todo.class);
        assertEquals("checking software working", annotation.task(), "Task should be checking software working");
        assertEquals("Om Tamrakar", annotation.assignedTo(), "AssignedTo should be Om Tamrakar");
        assertEquals("High", annotation.priority(), "Priority should be High");
    }
}
