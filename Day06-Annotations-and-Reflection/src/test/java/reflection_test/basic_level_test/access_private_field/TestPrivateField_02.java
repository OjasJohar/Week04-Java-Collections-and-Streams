package reflection_test.basic_level_test.access_private_field;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reflection.basic_level.access_private_field.Person;

import java.lang.reflect.Field;

public class TestPrivateField_02 {
    private Person p;

    @BeforeEach
    void setUP(){
        p=new Person(18);
        System.out.println("Test Started");
    }
    @AfterEach
    void print(){
        System.out.println("Test Completed");
    }
    @Test
    void test() throws NoSuchFieldException, IllegalAccessException {
        Class<?> cls=Person.class;
        Field f=cls.getDeclaredField("age");
        f.setAccessible(true);

        Assertions.assertEquals(18, f.get(p));
        f.set(p, 22);
        Assertions.assertEquals(22, f.get(p));
    }
}
