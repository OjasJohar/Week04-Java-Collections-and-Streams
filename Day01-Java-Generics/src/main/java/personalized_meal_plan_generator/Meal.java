package personalized_meal_plan_generator;

public class Meal<T extends MealPlan>{
    private T meal;

    Meal(T meal){
        this.meal=meal;
    }

    public void displayMeal() {
        meal.showMeal();
    }
}
