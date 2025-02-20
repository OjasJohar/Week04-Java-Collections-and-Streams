package annotations.practiceproblems.beginnerlevel.todoannotation;
import java.lang.annotation.*;

public class TodoTask {

    @Todo(task = "Requirement gathering", assignedTo = "Sejal chauhan",priority = "High")
    public void task1(){
        System.out.println("Software development");
    }

    @Todo(task = "SRS preparation", assignedTo = "Manish patel", priority = "Low")
    public void task2(){
        System.out.println("Gathering Tools");
    }

    @Todo(task = "Writing code",assignedTo = "Anush Tenguriya", priority = "High")
    public void task3(){
        System.out.println("Starting developement");
    }

    @Todo(task = "Testing the code", assignedTo = "Ojas Johar", priority = "Medium")
    public void task4(){
        System.out.println("Junit Testing");
    }

    @Todo(task = "checking software working", assignedTo = "Om Tamrakar" , priority = "High")
    public void task5(){
        System.out.println("Software Review");
    }
}
