package ai_driven_resume_screening_system;

import java.util.List;

public class MultipleResume {
    public static <T extends JobRole> void processMultipleResume(List<T> resumes){
        System.out.println("Processing multiple resume.");
        for(T resume:resumes){
            resume.displayDetails();
        }
    }
}
