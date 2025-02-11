package ai_driven_resume_screening_system;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningSystem_05 {
    public static void main(String[] args) {

        Resume<SoftwareEngineer> resume1=new Resume<>(new SoftwareEngineer("Anush Tenguriya" , 5));
        Resume<DataScientist> resume2=new Resume<>(new DataScientist("Ojas Johar",4));
        Resume<ProductManager> resume3=new Resume<>(new ProductManager("Om Tamrakar",6));

        resume1.processResume();
        resume2.processResume();
        resume3.processResume();

        List<JobRole> resumes=new ArrayList<>();
        resumes.add(new SoftwareEngineer("Sejal chouhan" , 5));
        resumes.add(new DataScientist("Raj Chandanan",4));
        resumes.add(new ProductManager("Manish Patel",6));
        resumes.add(new SoftwareEngineer("Arpita Gautam",4));

        MultipleResume.processMultipleResume(resumes);

    }
}
