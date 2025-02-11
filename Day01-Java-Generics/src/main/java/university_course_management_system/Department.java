package university_course_management_system;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private List<Course> courses;

    Department(){
        courses=new ArrayList<>();
    }

    public void addCourse(Course course){
      courses.add(course);
    }

    public void displayDetails(){
        System.out.println("-----Department Course Details-----");

        if(courses.isEmpty()){
            System.out.println("No Details !!");
        }
        for(Course course: courses) {
            System.out.println("Name   :" + course.getName());
            System.out.println("Fees   :" + course.getFees());
            course.getEvaluation();
            System.out.println("----------------------------------");
        }
    }
}
