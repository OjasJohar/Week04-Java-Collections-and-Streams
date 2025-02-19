package reflection.intermediate_level.access_and_modify_static_fields;

import java.lang.reflect.Field;

public class ConfigurationReflection_07 {
    public static void accessingAndModifyingStaticFields(){
        String classPath="reflection.intermediate_level.access_and_modify_static_fields.Configuration";
        try{
            Configuration configuration=new Configuration("njdgbbcnunreuhbfbsdbuh");
            Class<?> cls=Class.forName(classPath);
            Field field=cls.getDeclaredField("API_KEY");
            field.setAccessible(true);

            System.out.println("Old value : " + field.get(configuration));
            field.set(configuration,"Helkbbiihjkbjkbjln1234");
            System.out.println("New values : " + field.get(configuration));

        } catch (ClassNotFoundException | NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        accessingAndModifyingStaticFields();
    }
}
