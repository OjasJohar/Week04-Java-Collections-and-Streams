package annotations.practiceproblems.beginnerlevel.todoannotation;

import java.lang.reflect.Method;

public class TaskExecution {
    public static void main(String[] args) throws Exception{

        try{
            TodoTask todo = new TodoTask();

            Method method1 = todo.getClass().getMethod("task1");
            Method method2 = todo.getClass().getMethod("task2");
            Method method3 = todo.getClass().getMethod("task3");
            Method method4 = todo.getClass().getMethod("task4");
            Method method5 = todo.getClass().getMethod("task5");

            Method[] methods = {method1,method2,method3,method4,method5};

            for(int i=0; i<5; i++){
                Method method = methods[i];
                if(method.isAnnotationPresent(Todo.class)){
                    Todo annotation = method.getAnnotation(Todo.class);
                    System.out.println("-----------------------------------------");
                    System.out.println("Task        : "+annotation.task());
                    System.out.println("Assigned to : "+annotation.assignedTo());
                    System.out.println("Priority    : "+annotation.priority());
                    System.out.println("----------------------------------------");
                }
            }
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }


    }

}
