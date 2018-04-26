package holding;

import java.util.*;

class Counter {
    int i = 1;
    public String toString(){
        return Integer.toString(i);
    }
}

class HisToUnit implements Comparable<HisToUnit>{
    Counter counter;
    Integer val;
    public HisToUnit(Counter counter,Integer val){
        this.counter = counter;
        this.val = val;
    }

    @Override
    public int compareTo(HisToUnit o) {
        int lv = o.counter.i;
        int rv = counter.i;
        return (lv < rv? -1:(lv == rv? 0:1));
    }

    public String toString(){
        return "Value = " + val + ", Occurrences = " + counter.i + "\n";
    }
}

public class E23_RepeatTest {
    private static Random rand = new Random(47);
    public static void main(String[] args){
        Map<Integer,Counter> m = new HashMap<>();
        for(int i = 0;i < 10000;i++){
            int r = rand.nextInt(50);
            if(m.containsKey(r))
                m.get(r).i++;
            else
                m.put(r,new Counter());
        }
        List<HisToUnit> list = new ArrayList<>();
        Iterator<Map.Entry<Integer,Counter>> it = m.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,Counter> entry = it.next();
            list.add(new HisToUnit(entry.getValue(),entry.getKey()));
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
