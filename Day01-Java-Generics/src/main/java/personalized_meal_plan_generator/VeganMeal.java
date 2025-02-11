package personalized_meal_plan_generator;

public class VeganMeal implements MealPlan{
    @Override
    public void showMeal(){
        System.out.println("Vegan Meal: Tofu & Almond Milk");
    }
}
