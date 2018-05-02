package holding;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random rand = new Random();
        for(int i = 0;i < 10;i++)
            priorityQueue.offer(rand.nextInt(i + 10));
        QueueDemo.printQ(priorityQueue);

        List<Integer> list = Arrays.asList(2,5,8,69,2,12,9,22);
        priorityQueue = new PriorityQueue<>(list);
        QueueDemo.printQ(priorityQueue);

        priorityQueue = new PriorityQueue<>(list.size(), Collections.reverseOrder());
        priorityQueue.addAll(list);
        QueueDemo.printQ(priorityQueue);

        String fact = "wusongyuanyuanyongyuanyizaiyiqi";
        List<String> Strings = Arrays.asList(fact.split(""));
        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>(Strings);
        QueueDemo.printQ(priorityQueue1);

        priorityQueue1 = new PriorityQueue<>(list.size(), Collections.reverseOrder());
        priorityQueue1.addAll(Strings);
        QueueDemo.printQ(priorityQueue1);
    }
}
