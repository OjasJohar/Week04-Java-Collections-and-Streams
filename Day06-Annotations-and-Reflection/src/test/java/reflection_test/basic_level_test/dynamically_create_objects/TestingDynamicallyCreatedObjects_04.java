package reflection_test.basic_level_test.dynamically_create_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reflection.basic_level.dynamically_create_objects.DynamicallyCreateObjects_04;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestingDynamicallyCreatedObjects_04 {

    @Test
    void test() throws Exception {
        ByteArrayOutputStream output=new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        String[] arr=new String[1];
        DynamicallyCreateObjects_04.main(arr);
        String expected="Student Name: Ojas" +System.lineSeparator();
        Assertions.assertEquals(expected, output.toString());
    }
}
