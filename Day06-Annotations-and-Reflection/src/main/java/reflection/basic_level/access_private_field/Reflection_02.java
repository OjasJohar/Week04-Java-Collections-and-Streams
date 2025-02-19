package reflection.basic_level.access_private_field;

import java.lang.reflect.Field;

public class Reflection_02 {

    public static void main(String[] args) throws Exception {
        Person p=new Person(18);
        Class<?> cls= p.getClass();

        Field field=cls.getDeclaredField("age");
        field.setAccessible(true);
        System.out.println("Age :"+field.get(p));

        field.set(p, 22);
        System.out.println("Modified Age :"+field.get(p));
    }
}