package reflection_test.basic_level_test.get_class_information;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestingGetClassInformation_01 {
    private static Class<?> cls;

    @BeforeAll
    static void setUp() throws ClassNotFoundException {
        cls= Class.forName("java.util.ArrayList");
    }

    @Test
    void testClassName() {
        assertEquals("java.util.ArrayList", cls.getName(), "Class name should match");
    }

    @Test
    void testFields() {
        Field[] fields = cls.getDeclaredFields();
        assertNotNull(fields, "Fields array should not be null");
        assertTrue(fields.length > 0, "There should be at least one declared field");
    }

    @Test
    void testConstructors() {
        Constructor<?>[] constructors = cls.getDeclaredConstructors();
        assertNotNull(constructors, "Constructors array should not be null");
        assertTrue(constructors.length > 0);
    }

    @Test
    void testMethodsExistence() {
        Method[] methods = cls.getDeclaredMethods();
        assertNotNull(methods);
        assertTrue(methods.length > 0);
    }

    @Test
    void testSpecificMethodExists() throws NoSuchMethodException {
        Method method = cls.getDeclaredMethod("add", Object.class);
        assertNotNull(method, "Method 'add(Object)' should exist in ArrayList");
    }
}