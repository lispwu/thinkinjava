package holding;

import java.util.Collection;
import java.util.HashSet;

public class E02_SimpleSet {
    public static void main(String[] args){
        Collection<Integer> c = new HashSet<>();
        for(int i = 0;i < 10;i++){
            c.add(i);
        }
        System.out.println(c.toString());
    }
}
