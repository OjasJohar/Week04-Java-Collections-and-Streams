package finally_block_execution;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FinallyBlockExecutionTest_07 {
    @Test
    void successFullDivisionTest(){
        ByteArrayOutputStream output=new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        FinallyBlockExecution_07.divisionOperation(10,2);
        String expectedOutput = "Answer(10/2) : 5" + System.lineSeparator() + "Operation Completed." + System.lineSeparator();
        assertEquals(expectedOutput,output.toString());
    }
    @Test
    void dividebyZeroTest(){
        ByteArrayOutputStream output=new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        FinallyBlockExecution_07.divisionOperation(10,0);
        String expectedOutput = "Invalid Operation: Divide by Zero." + System.lineSeparator() + "Operation Completed." + System.lineSeparator();
        assertEquals(expectedOutput,output.toString());
    }
}
