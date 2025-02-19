package reflection_test.intermediate_level_test.retrieve_annotations_at_runtime;

import org.junit.jupiter.api.Test;
import reflection.intermediate_level.retrieve_annotations_at_runtime.Author;
import reflection.intermediate_level.retrieve_annotations_at_runtime.MyClass;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestRetrieveAnnotations_06 {
    @Test
    void testRetrieveAnnotationAtRuntime() {
        Class<MyClass> obj = MyClass.class;
        Author annotation = obj.getAnnotation(Author.class);

        assertNotNull(annotation, "The @Author annotation should be present.");
        assertEquals("Ojas Johar", annotation.name()
                , "The @Author annotation's name should be 'Ojas Johar'.");
    }
}
