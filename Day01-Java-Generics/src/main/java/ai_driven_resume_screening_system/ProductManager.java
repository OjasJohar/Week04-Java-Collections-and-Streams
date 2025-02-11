package ai_driven_resume_screening_system;

public class ProductManager extends JobRole{
    ProductManager(String candidateName, int experience){
        super(candidateName,experience);
    }

    @Override
    public void displayDetails(){
        System.out.println("Product Manager  : " + getName());
        System.out.println("Experience       : " + getExperience() + " years");
        System.out.println("- - - - - - - - - - - - - - - - - ");
    }
}
