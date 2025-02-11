package personalized_meal_plan_generator;

public class MealPlanGenerator {
    public static <T extends MealPlan> Meal<T> generatorMeal(T meal){
       return new Meal<>(meal);
    }
}
