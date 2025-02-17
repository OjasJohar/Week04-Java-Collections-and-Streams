package junit_test.basic_junit_test.performance_testing_using_timeout;

import junit.basic_junit_test.performance_testing_using_timeout.Performance_07;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class PerformanceTestingUsingTimeout_07 {
    private Performance_07 task;
    @BeforeEach
    void setUp(){
        task=new Performance_07();
        System.out.println("Test Started");
    }

    @Test
    @Timeout(value = 5, unit= TimeUnit.SECONDS)
    void testLongRunningTask1() throws InterruptedException{
        //Passing Test.
        Assertions.assertEquals("Task Completed", task.longRunningTask());
    }
    @Test
    @Timeout(value = 2, unit= TimeUnit.SECONDS)
    void testLongRunningTask2() throws InterruptedException{
        //Failure Test.
        Assertions.assertEquals("Task Completed", task.longRunningTask());
    }
}
