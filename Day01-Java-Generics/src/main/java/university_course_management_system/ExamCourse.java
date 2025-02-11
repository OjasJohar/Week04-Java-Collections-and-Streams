package university_course_management_system;

public class ExamCourse extends CourseType{

    ExamCourse(String name,double fees){
        super(name,fees);
    }

    @Override
    public void evaluate(){
        System.out.println(getName() + ", is evaluated based on exam.");
    }

}
