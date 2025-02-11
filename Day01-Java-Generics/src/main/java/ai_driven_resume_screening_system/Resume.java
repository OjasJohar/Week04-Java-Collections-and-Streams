package ai_driven_resume_screening_system;

public class Resume<T extends JobRole>{
    private T jobRole;

    Resume(T joRole){
        this.jobRole=joRole;
    }

    public void processResume(){
        System.out.println("Processing Resume.");
        jobRole.displayDetails();
    }
}
