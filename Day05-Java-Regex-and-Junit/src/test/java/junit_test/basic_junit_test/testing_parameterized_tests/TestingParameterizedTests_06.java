package junit_test.basic_junit_test.testing_parameterized_tests;

import junit.basic_junit_test.testing_parameterized_tests.ParameterizedTests_06;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingParameterizedTests_06 {

    @BeforeEach
    void setUp(){
        System.out.println("Test Started");
    }
    @AfterEach
    void print(){
        System.out.println("Test Completed");
    }
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void testEvenNumber(int num) {
        boolean res=ParameterizedTests_06.isEven(num);
        assertEquals(res,num%2==0);
    }
}
