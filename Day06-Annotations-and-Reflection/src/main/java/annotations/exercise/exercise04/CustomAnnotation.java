package annotations.exercise.exercise04;

import java.lang.reflect.Method;

public class CustomAnnotation {
    public static void main(String[] args) throws Exception {
        try{
            TaskManager task = new TaskManager();

            Method method = task.getClass().getMethod("completedTask");

            if(method.isAnnotationPresent(TaskInfo.class)){
                TaskInfo annotation = method.getAnnotation(TaskInfo.class);

                System.out.println("Task Priority    : "+annotation.priority());
                System.out.println("Task Assigned To : "+annotation.assignedTO());
            }
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }

    }
}
