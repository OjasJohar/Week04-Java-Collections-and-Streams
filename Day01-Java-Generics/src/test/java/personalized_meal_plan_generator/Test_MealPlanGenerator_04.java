package personalized_meal_plan_generator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_MealPlanGenerator_04 {

    @Test
    void testVegetarianMeal(){
        Meal<VegetarianMeal> vegMeal=MealPlanGenerator.generatorMeal(new VegetarianMeal());
        Assertions.assertNotNull(vegMeal);
    }
    @Test
    void testVeganMeal(){
        Meal<VeganMeal> veganMeal = MealPlanGenerator.generatorMeal(new VeganMeal());
        Assertions.assertNotNull(veganMeal);
    }
    @Test
    void testKetoMeal(){
        Meal<KetoMeal> ketoMeal = MealPlanGenerator.generatorMeal(new KetoMeal());
        Assertions.assertNotNull(ketoMeal);
    }
    @Test
    void testProteinMeal(){
        Meal<HighProteinMeal> proteinMeal = MealPlanGenerator.generatorMeal(new HighProteinMeal());
        Assertions.assertNotNull(proteinMeal);
    }
}
