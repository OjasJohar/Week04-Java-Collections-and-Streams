package multiple_Catch_blocks;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultipleCatchBlocksTest_04 {

    @Test
    void successfulDivisionTest(){
        ByteArrayOutputStream output=new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        int index=4;
        MultipleCatchBlocks_04.printArrayValue(arr,index);
        String expected="Value at index 4: 5";
        assertEquals(expected,output.toString().trim());
    }
    @Test
    void invalidIndexDivisionTest(){
        ByteArrayOutputStream output=new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        int index=15;
        MultipleCatchBlocks_04.printArrayValue(arr,index);
        String expected="Invalid index!";
        assertEquals(expected,output.toString().trim());
    }

    @Test
    void ArrayNotInitializedDivisionTest() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        int[] arr = null;
        int index = 15;
        MultipleCatchBlocks_04.printArrayValue(arr, index);
        String expected = "Array is not initialized!";
        assertEquals(expected, output.toString().trim());
    }
}
