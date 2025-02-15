package nested_try_catch_block;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NestedTryCatchBlockTest_09 {
    @Test
    void successfulDivisionInArray(){
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        int index=5;
        int divisor=2;

        ByteArrayOutputStream output=new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        NestedTryCatchBlock_09.divisionInArray(arr,divisor,index);
        String expected="Division result: 3";
        assertEquals(expected,output.toString().trim());
    }

    @Test
    void divideByZeroTest(){
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        int index=5;
        int divisor=0;

        ByteArrayOutputStream output=new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        NestedTryCatchBlock_09.divisionInArray(arr,divisor,index);
        String expected="Cannot divide by zero!";
        assertEquals(expected,output.toString().trim());
    }

    @Test
    void invalidArrayIndexTest(){
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        int index=15;
        int divisor=3;

        ByteArrayOutputStream output=new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        NestedTryCatchBlock_09.divisionInArray(arr,divisor,index);
        String expected="Invalid array index!";
        assertEquals(expected,output.toString().trim());
    }
}
