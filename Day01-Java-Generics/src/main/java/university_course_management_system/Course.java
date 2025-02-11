package university_course_management_system;

public class Course<T extends CourseType> {
    private T course;

    Course(T course){
        this.course=course;
    }

    public void getEvaluation(){
        course.evaluate();
    }

    public String getName(){
        return course.getName();
    }

    public double getFees(){
        return course.getFees();
    }
}
