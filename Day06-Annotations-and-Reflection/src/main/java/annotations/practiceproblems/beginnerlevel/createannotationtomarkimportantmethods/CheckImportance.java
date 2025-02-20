package annotations.practiceproblems.beginnerlevel.createannotationtomarkimportantmethods;
import java.lang.reflect.Method;

public class CheckImportance {
    public static void main(String[] args) throws Exception {

        try{
            ClassMethod cal = new ClassMethod();

            Method method = cal.getClass().getMethod("processOne");
            Method method1 = cal.getClass().getMethod("processTwo");

            if(method.isAnnotationPresent(ImportantMethod.class)){
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println(annotation.importance());
            }

            if(method1.isAnnotationPresent(ImportantMethod.class)){
                ImportantMethod annotation = method1.getAnnotation(ImportantMethod.class);
                System.out.println(annotation.importance());
            }
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }

    }
}
