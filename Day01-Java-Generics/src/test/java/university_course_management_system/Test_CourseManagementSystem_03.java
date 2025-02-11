package university_course_management_system;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_CourseManagementSystem_03 {

    @Test
    void testingExamCourse(){
        ExamCourse examCourse1=new ExamCourse("Ojas", 10000);
        String resS=examCourse1.getName();
        double resI=examCourse1.getFees();

        Assertions.assertEquals(10000, resI);
        Assertions.assertEquals("Ojas", resS);
    }
    @Test
    void testingResearchCourse(){
        ResearchCourse researchCourse=new ResearchCourse("Ojas",12000);
        String resS=researchCourse.getName();
        double resI=researchCourse.getFees();

        Assertions.assertEquals(12000, resI);
        Assertions.assertEquals("Ojas", resS);
    }
    @Test
    void testAssignmentCourse(){
        AssignmentCourse assignmentCourse=new AssignmentCourse("Ojas",15000);
        String resS=assignmentCourse.getName();
        double resI=assignmentCourse.getFees();

        Assertions.assertEquals(15000, resI);
        Assertions.assertEquals("Ojas", resS);
    }
    @Test
    void testCourse(){
        ExamCourse examCourse1=new ExamCourse("Ojas", 10000);
        Course<ExamCourse> course1=new Course<>(examCourse1);
        course1.getEvaluation();

        Assertions.assertEquals(10000, course1.getFees());
        Assertions.assertEquals("Ojas", course1.getName());
    }
    @AfterAll
    static void testDepartment(){
        Department department=new Department();
        department.displayDetails();

        ExamCourse examCourse=new ExamCourse("Ojas", 10000);
        Course<ExamCourse> course=new Course<>(examCourse);

        department.addCourse(course);
        department.displayDetails();
    }
}
