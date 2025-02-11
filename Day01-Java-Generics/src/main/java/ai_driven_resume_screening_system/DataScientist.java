package ai_driven_resume_screening_system;

public class DataScientist extends JobRole{
    DataScientist(String candidateName, int experience){
        super(candidateName,experience);
    }

    @Override
    public void displayDetails(){
        System.out.println("Data Scientist  : " + getName());
        System.out.println("Experience      : " + getExperience() + " years");
        System.out.println("- - - - - - - - - - - - - - - - - ");
    }
}
