package reflection.basic_level.dynamically_create_objects;

import java.lang.reflect.Constructor;

public class DynamicallyCreateObjects_04 {

    public static void main(String[] args) throws Exception {
        Class<?> cls = Student.class;
        Constructor<?> constructor = cls.getConstructor(String.class);
        Student student = (Student) constructor.newInstance("Ojas");
        student.display();
    }
}
