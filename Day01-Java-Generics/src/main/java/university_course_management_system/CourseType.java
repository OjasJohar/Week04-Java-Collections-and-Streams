package university_course_management_system;

public abstract class CourseType {
    private String name;
    private double fees;

    public CourseType(String name, double fees){
        this.name=name;
        this.fees=fees;

    }

    public String getName(){
        return name;
    }

    public double getFees(){
        return fees;
    }

    abstract public void evaluate();
}
