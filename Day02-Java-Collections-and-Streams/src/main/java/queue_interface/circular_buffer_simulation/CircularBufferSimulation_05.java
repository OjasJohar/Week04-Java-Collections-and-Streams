package queue_interface.circular_buffer_simulation;

import java.util.Arrays;
import java.util.List;

public class CircularBufferSimulation_05 {
    Integer[] arr;
    int size;
    int maxSize;

    public CircularBufferSimulation_05(int bufferSize){
        arr=new Integer[bufferSize];
        size=-1;
        maxSize=bufferSize;
    }

    public void insert(int x){
        if(size<maxSize-1){
            size++;
            arr[size]=x;
        }else{
            size=0;
            arr[size]=x;
        }
    }

    public void delete(){
        if(size==0){
            arr[0]=0;
            size=maxSize-1;
        }else{
            arr[size]=0;
            size--;
        }
    }

    public void display(){
        System.out.println(Arrays.toString(arr));
    }

    public List<Integer> QueueAsList(){
        return Arrays.asList(arr);
    }

    public static void main(String[] args) {
        CircularBufferSimulation_05 queue=new CircularBufferSimulation_05(3);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.display();

        queue.delete();
        queue.display();

        queue.delete();
        queue.display();
    }
}
