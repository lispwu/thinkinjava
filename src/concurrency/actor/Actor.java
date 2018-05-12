package concurrency.actor;

public class Actor extends Thread{
    public void run(){
        System.out.println(getName() + "登台表演了！");
        int count = 0;
        while(count < 100){
            System.out.println(getName() + "演出了" + (++count) + "次");
            if(count%10 == 0){
                try{
                    Thread.sleep(1000);
                    System.out.println("中场休息一下哦~~");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println(getName() + "表演结束！");
    }

    public static void main(String[] args){
        Actor actor = new Actor();
        actor.setName("wusong");
        actor.start();

        Thread actressThread = new Thread(new Actress(),"xiaoxiao");
        actressThread.start();
    }
}

class Actress implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "登台表演了！");
        int count = 0;
        while(count < 100){
            System.out.println(Thread.currentThread().getName()+ "演出了" + (++count) + "次");
            if(count%10 == 0){
                try{
                    Thread.sleep(2000);
                    System.out.println("中场休息一下哦~~不过我休息更久嘻嘻");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println(Thread.currentThread().getName() + "表演结束！");
    }
}
