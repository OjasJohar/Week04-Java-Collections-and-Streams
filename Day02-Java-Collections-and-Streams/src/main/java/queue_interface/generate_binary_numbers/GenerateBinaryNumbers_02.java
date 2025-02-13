package queue_interface.generate_binary_numbers;

import java.util.ArrayDeque;
import java.util.Queue;

public class GenerateBinaryNumbers_02 {

    public static Queue<String> generateBinaryNumberFromQueue(int n){
        int x=1;
        Queue<String> queue=new ArrayDeque<>();
        while(x<=n) {
            int x1 = x;
            StringBuilder s= new StringBuilder();
            while (x1 > 0) {
                int temp=x1 % 2;
                s.insert(0, temp);
                x1 = x1 / 2;
            }
            x++;
            queue.add(s.toString());
        }
        return queue;
    }

    public static void main(String[] args) {
       int n=5;
       Queue<String> queue=generateBinaryNumberFromQueue(n);
       System.out.println(queue);
    }
}
