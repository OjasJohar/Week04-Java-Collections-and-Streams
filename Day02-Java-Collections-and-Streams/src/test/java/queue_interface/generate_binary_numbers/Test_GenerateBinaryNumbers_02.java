package queue_interface.generate_binary_numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Test_GenerateBinaryNumbers_02 {

    @Test
    void testGenerateBinaryNumber(){
        int n=5;
        Queue<String> queue=GenerateBinaryNumbers_02.generateBinaryNumberFromQueue(n);
        Queue<String> expected=new ArrayDeque<>(Arrays.asList("1", "10", "11", "100", "101"));

        Assertions.assertArrayEquals(expected.toArray(), queue.toArray());
    }
}