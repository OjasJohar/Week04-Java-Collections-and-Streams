package reflection_test.basic_level_test.invoke_private_method;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reflection.basic_level.invoke_private_method.Calculator;
import reflection.basic_level.invoke_private_method.InvokePrivateMethod_03;

public class TestPrivateMethod_03 {
    private Calculator cal;

    @BeforeEach
    void setUp(){
        cal=new Calculator();
        System.out.println("Test Started");
    }
    @Test
    void testPrivateMethod() throws Exception {
        int res= InvokePrivateMethod_03.InvokePrivateMethod(cal, 4, 4);
        Assertions.assertEquals(16, res);
    }
}
