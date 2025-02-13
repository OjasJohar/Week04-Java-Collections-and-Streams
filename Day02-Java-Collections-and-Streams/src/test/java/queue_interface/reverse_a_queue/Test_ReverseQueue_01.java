package queue_interface.reverse_a_queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Test_ReverseQueue_01 {

    @Test
    void testReverseQueue(){
        Queue<Integer> queue=new LinkedList<>(Arrays.asList(10, 2, 66, 1, 55));
        System.out.println("Queue :"+queue);

        Queue<Integer> revQueue=ReverseQueue_01.reverseQueue(queue);
        System.out.println("Reversed Queue :"+revQueue);

        Queue<Integer> expected=new LinkedList<>(Arrays.asList(55,1,66,2,10));

        Assertions.assertEquals(expected, revQueue);
    }
}
