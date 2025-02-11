package personalized_meal_plan_generator;

public class MealPlanGenerator_04 {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal=MealPlanGenerator.generatorMeal(new VegetarianMeal());
        vegMeal.displayMeal();

        Meal<VeganMeal> veganMeal = MealPlanGenerator.generatorMeal(new VeganMeal());
        veganMeal.displayMeal();

        Meal<KetoMeal> ketoMeal = MealPlanGenerator.generatorMeal(new KetoMeal());
        ketoMeal.displayMeal();

        Meal<HighProteinMeal> proteinMeal = MealPlanGenerator.generatorMeal(new HighProteinMeal());
        proteinMeal.displayMeal();
    }
}
