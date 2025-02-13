package queue_interface.reverse_a_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue_01 {

    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue :"+queue);

        Queue<Integer> revQueue=reverseQueue(queue);
        System.out.println("Reversed Queue :"+revQueue);
    }

    public static Queue<Integer> reverseQueue(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();

        // Step 1: Remove all elements from queue and push onto stack
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        // Step 2: Pop from stack and add back to queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        return queue;
    }
}
