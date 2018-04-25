package holding;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class E13_InsertMiddle {
    public static void main(String[] args){
        List<Integer> list = new LinkedList<>();
        ListIterator<Integer> it = list.listIterator();
        for(int i = 1;i <= 10;i++){
            it.add(i);
            if(i % 2 == 0)
                it.previous();
        }
        System.out.println(list);
    }

}
