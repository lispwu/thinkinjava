package holding;

import java.util.LinkedList;
import java.util.Queue;

class Command{
    private String name;
    public Command(String name){
        this.name = name;
    }
    public void operation(){
        System.out.println(name);
    }
}

class UseCommand{
    public static void fillQueue(Queue<Command> q){
        q.offer(new Command("wu"));
        q.offer(new Command("song"));
        q.offer(new Command("yuan"));
        q.offer(new Command("yuan"));
    }
}

class Comsumer{
    public static void consume(Queue<Command> q){
        while(q.peek() != null)
            q.remove().operation();

    }
}
public class E27_Queue {
    public static void main(String[] args){
        Queue<Command> q = new LinkedList<>();
        UseCommand.fillQueue(q);
        Comsumer.consume(q);
    }
}
