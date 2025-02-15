package Checked_exception_test;

import checked_exception.CheckedException_01;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class CheckedExceptionTest_01 {

    @Test
    void readingFileTest(){
        String filePath="src/main/java/checked_exception/Data.txt";
        assertDoesNotThrow(()-> CheckedException_01.readingFile(filePath));
    }
}
