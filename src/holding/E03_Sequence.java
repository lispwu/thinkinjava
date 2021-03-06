package holding;


import java.util.ArrayList;
import java.util.List;

interface Selector{
    boolean end();
    Object current();
    void next();
}

public class E03_Sequence {
    List<Object> items = new ArrayList<Object>();

    public void add(Object x) {
        items.add(x);
    }

    private class SequenceSelector implements Selector{
        private int i = 0;
        @Override
        public boolean end() {
            return i == items.size();
        }

        @Override
        public Object current() {
            return items.get(i);
        }

        @Override
        public void next() {
            if(i < items.size())
                i++;
        }
    }
    public Selector selector(){
        return new SequenceSelector();
    }

    public static void main(String[] args){
        E03_Sequence sequence = new E03_Sequence();
        for (int i = 0;i < 10;i++){
            sequence.add(i);
        }
        Selector selector = sequence.selector();
        while(!selector.end()){
            System.out.println("i = " + selector.current());
            selector.next();
        }
    }
}
