package holding;

import java.util.PriorityQueue;
import java.util.Random;

public class E28_FillWithDouble {
    public static void main(String[] args){
        PriorityQueue<Double> priorityQueue = new PriorityQueue<>();
        Random rand = new Random();
        for(int i = 0;i < 10;i++)
            priorityQueue.offer(rand.nextDouble() * 100);
       while(priorityQueue.peek() != null)
           System.out.println(priorityQueue.poll());
       System.out.println(priorityQueue.size());
    }
}
