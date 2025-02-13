package queue_interface.stack_using_queues;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Test_StackUsingQueues_04 {
    @Test
    void stackQueueTest(){
        StackUsingQueues_04 queue=new StackUsingQueues_04();
        queue.push(1);
        queue.push(2);
        queue.push(3);

        Queue<Integer> expected=new ArrayDeque<>(Arrays.asList(1,2,3));
        assertArrayEquals(queue.toQueue().toArray(),expected.toArray());
    }

}
