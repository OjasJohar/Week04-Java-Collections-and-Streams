package junit_test.basic_junit_test.testing_a_calculator_class;

import junit.basic_junit_test.testing_a_calculator_class.CalculatorClass_01;
import org.junit.jupiter.api.*;

public class TestingCalculatorClass_01 {
    private CalculatorClass_01 calculator;

    @BeforeEach
    void setUp() {
        calculator = new CalculatorClass_01();
        System.out.println("Running Test");
    }
    @AfterEach
    void after(){
        System.out.println("Test Completed");
    }

    @Test
    @DisplayName("Test 1: For Add Method")
    void testAddMethod(){
        int res=calculator.add(2,2);
        Assertions.assertEquals(4, res);
    }
    @Test
    @DisplayName("Test 2: For Subtract Method")
    void testSubtractMethod(){
        int res=calculator.subtract(4,2);
        Assertions.assertEquals(2, res);
    }
    @Test
    @DisplayName("Test 3: For Multiply Method")
    void testMultiplyMethod(){
        int res=calculator.multiply(3,3);
        Assertions.assertEquals(9, res);
    }
    @Test
    @DisplayName("Test 4: For Divide Method")
    void testDivideMethod1(){
        int res=calculator.divide(10,2);
        Assertions.assertEquals(5, res);
    }
    @Test
    @DisplayName("Test 4: For Divide Method With Exception")
    void testDivideMethod2(){
        Assertions.assertThrows(ArithmeticException.class,()-> calculator.divide(5,0)
                , "Exception not found");
    }
}
