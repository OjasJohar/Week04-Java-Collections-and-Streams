package queue_interface.circular_buffer_simulation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_BufferSimulation_05 {
    @Test
    void circularQueueTest(){
        CircularBufferSimulation_05 queue=new CircularBufferSimulation_05(3);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);

        List<Integer> expected= Arrays.asList(4,2,3);
        assertEquals(queue.QueueAsList(),expected);

    }
}
