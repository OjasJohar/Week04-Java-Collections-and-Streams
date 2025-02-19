package reflection.basic_level.get_class_information;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.*;
import java.util.Scanner;

public class GetClassInformation_01 {

    String name="Ojas";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the class name: ");
            String className = scanner.nextLine();

            // Loading class dynamically
            Class<?> cls = Class.forName(className);
            System.out.println("\nClass Name: " + cls.getName());

            // Display fields
            System.out.println("\nFields:");
            Field[] fields = cls.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("  "+ Modifier.toString(field.getModifiers())
                        +" " + field.getType().getSimpleName()+ " " + field.getName());
            }

            // Display constructors
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println("  " + Modifier.toString(constructor.getModifiers())
                        +" "+ constructor.getName() + getParameters(constructor.getParameters()));
            }

            // Display methods
            System.out.println("\nMethods:");
            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("  " + Modifier.toString(method.getModifiers()) + " "
                        + method.getReturnType().getSimpleName() + " " + method.getName()
                        + getParameters(method.getParameters()));
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found. Please enter a valid class name.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Helper method to format parameters of methods and constructors
    private static String getParameters(Parameter[] parameters) {
        StringBuilder params = new StringBuilder("(");
        for (int i=0; i<parameters.length; i++) {
            if (i > 0) params.append(", ");
            params.append(parameters[i].getType().getSimpleName()).append(" ").append(parameters[i].getName());
        }
        params.append(")");
        return params.toString();
    }
}