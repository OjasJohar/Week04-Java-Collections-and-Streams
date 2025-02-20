package annotations.exercise.exercise04;

public class TaskManager {
    @TaskInfo(priority = "High", assignedTO = "Ojas Johar")
    public void completedTask(){
        System.out.println("The task completed!");
    }
}
