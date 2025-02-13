package queue_interface.stack_using_queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingQueues_04 {
    Queue<Integer> enqueue;
    Queue<Integer> dequeue;

    public StackUsingQueues_04(){
        enqueue=new ArrayDeque<>();
        dequeue=new ArrayDeque<>();
    }

    public void push(int x) {
        enqueue.add(x);
    }

    public int pop() {
        int x = enqueue.remove();
        while (!enqueue.isEmpty()) {
            dequeue.add(x);
            x = enqueue.remove();
        }

        while (!dequeue.isEmpty()) {
            enqueue.add(dequeue.remove());
        }
        return x;
    }

    public int top(){
        int x=0;
        while(!enqueue.isEmpty()){
            x=enqueue.remove();
            dequeue.add(x);
        }

        while(dequeue.isEmpty()){
            enqueue.add(dequeue.remove());
        }
        return x;
    }

    public Queue<Integer> toQueue(){
        return enqueue;
    }

    public static void main(String[] args) {
        StackUsingQueues_04 queue=new StackUsingQueues_04();
        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println(queue.pop());

        System.out.println(queue.top());
    }
}
