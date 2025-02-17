package junit.basic_junit_test.performance_testing_using_timeout;

public class Performance_07 {

    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
        return "Task Completed";
    }
}
