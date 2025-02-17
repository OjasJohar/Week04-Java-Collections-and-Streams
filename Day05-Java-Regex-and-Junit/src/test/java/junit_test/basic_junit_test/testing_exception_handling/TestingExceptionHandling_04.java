package junit_test.basic_junit_test.testing_exception_handling;

import junit.basic_junit_test.testing_exception_handling.ExceptionHandling_04;
import org.junit.jupiter.api.*;

public class TestingExceptionHandling_04 {
    private ExceptionHandling_04 obj;

    @BeforeEach
    void setUp(){
        obj=new ExceptionHandling_04();
        System.out.println("Test Started");
    }
    @AfterEach
    void print(){
        System.out.println("Test Completed");
    }

    @Test
    @DisplayName("Testing for Exception")
    void testException1(){
        int a=4,b=2;
        int res=obj.divide(a,b);
        Assertions.assertEquals(2, res);
    }
    @Test
    @DisplayName("Testing for Exception")
    void testException2(){
        int a=5,b=0;
        Assertions.assertThrows(ArithmeticException.class,()-> obj.divide(a,b));
    }
}
