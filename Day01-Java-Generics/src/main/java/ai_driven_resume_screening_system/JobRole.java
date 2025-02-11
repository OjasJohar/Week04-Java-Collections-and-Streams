package ai_driven_resume_screening_system;

public abstract class JobRole {
    private String candidateName;
    private int experience;

    JobRole(String candidateName, int experience){
        this.candidateName=candidateName;
        this.experience=experience;
    }

    public String getName(){
        return candidateName;
    }

    public int getExperience(){
        return experience;
    }

    abstract void displayDetails();
}
