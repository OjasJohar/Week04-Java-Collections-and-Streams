package annotations_test.practiceproblems.basiclevelproblem.annotationformarkingimportantmethods;
import annotations.practiceproblems.beginnerlevel.createannotationtomarkimportantmethods.*;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

public class CreateAnnotationToMarkImpMethods {

    @Test
    void testProcessOneAnnotation() throws NoSuchMethodException {
        Method method = ClassMethod.class.getMethod("processOne");

        assertTrue(method.isAnnotationPresent(ImportantMethod.class), "Annotation should be present");

        ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
        assertEquals("High", annotation.importance(), "Importance should be High");
    }

    @Test
    void testProcessTwoAnnotation() throws NoSuchMethodException {
        Method method = ClassMethod.class.getMethod("processTwo");

        assertTrue(method.isAnnotationPresent(ImportantMethod.class), "Annotation should be present");

        ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
        assertEquals("Low", annotation.importance(), "Importance should be Low");
    }
}
