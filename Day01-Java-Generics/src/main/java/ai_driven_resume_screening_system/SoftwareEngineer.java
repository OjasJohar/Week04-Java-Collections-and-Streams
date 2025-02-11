package ai_driven_resume_screening_system;

public class SoftwareEngineer extends JobRole{
    SoftwareEngineer(String candidateName, int experience){
        super(candidateName,experience);
    }

    @Override
    public void displayDetails(){
        System.out.println("Software Engineer : " + getName());
        System.out.println("Experience        : " + getExperience() + " years");
        System.out.println("- - - - - - - - - - - - - - - - - - - ");
    }
}
