package reflection_test.intermediate_level_test.dynamic_method_invocation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reflection.intermediate_level.dynamic_method_invocation.MathOperations;
import java.lang.reflect.Method;


public class TestingMethodInvocation_05 {
    private MathOperations mathOps;

    @BeforeEach
    void setUp() {
        mathOps = new MathOperations();
    }

    @Test
    void testAdd() throws Exception {
        Method method = MathOperations.class.getMethod("add", int.class, int.class);
        int res = (int) method.invoke(mathOps, 5, 3);
        assertEquals(8, res);
    }

    @Test
    void testSubtract() throws Exception {
        Method method = MathOperations.class.getMethod("subtract", int.class, int.class);
        int res = (int) method.invoke(mathOps, 6, 3);
        assertEquals(3, res);
    }

    @Test
    void testMultiply() throws Exception {
        Method method = MathOperations.class.getMethod("multiply", int.class, int.class);
        int res = (int) method.invoke(mathOps, 5, 5);
        assertEquals(25, res);
    }
}