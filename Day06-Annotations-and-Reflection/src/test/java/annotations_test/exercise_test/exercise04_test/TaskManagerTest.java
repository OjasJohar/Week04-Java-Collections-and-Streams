package annotations_test.exercise_test.exercise04_test;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import annotations.exercise.exercise04.*;

class TaskManagerTest {

    @Test
    void testTaskInfoAnnotationPresenceAndValues() throws NoSuchMethodException {

        TaskManager task = new TaskManager();
        Method method = task.getClass().getMethod("completedTask");

        assertTrue(method.isAnnotationPresent(TaskInfo.class), "TaskInfo annotation should be present");

        TaskInfo annotation = method.getAnnotation(TaskInfo.class);

        assertEquals("High", annotation.priority(), "Priority should be 'High'");
        assertEquals("Ojas Johar", annotation.assignedTO(), "AssignedTo should be 'Ojas Johar'");
    }
}
