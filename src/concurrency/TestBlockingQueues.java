package concurrency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.*;

import static net.mindview.util.Print.*;

class LiftOffRunner implements Runnable{
    private BlockingQueue<LiftOff> rockets;
    public LiftOffRunner(BlockingQueue<LiftOff> queue){
        rockets = queue;
    }
    public void add(LiftOff lo){
        try{
            rockets.put(lo);
        }catch (InterruptedException e){
            print("Interrupted during put()");
        }
    }
    @Override
    public void run() {
        try{
            while(!Thread.interrupted()){
                LiftOff rocket = rockets.take();
                rocket.run();
            }
        }catch (InterruptedException e){
            print("Waking from take()");
        }
        print("Exiting LiftOffRunner");

    }
}


public class TestBlockingQueues {
    static void getKey(){
        try{
            new BufferedReader(new InputStreamReader(System.in)).readLine();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    static void getKey(String message){
        print(message);
        getKey();
    }

    static void test(String msg,BlockingQueue<LiftOff> queue){
        print(msg);
        LiftOffRunner runner = new LiftOffRunner(queue);
        Thread t = new Thread(runner);
        t.start();
        for(int i = 0;i < 5;i++)
            runner.add(new LiftOff(5));
        getKey("Press 'Enter' (" + msg + ")");
        t.interrupt();
        print("Finished " + msg + " test");
    }

    public static void main(String[] args){
        test("LinkedBlockingQueue",new LinkedBlockingQueue<>());
        test("ArrayBlockingQueue",new ArrayBlockingQueue<>(3));
        test("SynchronousQueue",new SynchronousQueue<>());


    }
}
