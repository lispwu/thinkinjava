package holding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class E17_GerbilMap {
    public static void main(String[] args){
        Map<String,Gerbil> map = new HashMap<>();
        map.put("hi",new Gerbil(1));
        map.put("hello",new Gerbil(2));
        map.put("44",new Gerbil(3));
        map.put("xiaobai",new Gerbil(4));

        Iterator<Map.Entry<String,Gerbil>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,Gerbil> entry = it.next();
            System.out.print(entry.getKey() + ": ");
            entry.getValue().hop();
        }
    }
}
