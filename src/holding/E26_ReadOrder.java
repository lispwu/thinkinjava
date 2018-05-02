package holding;

import net.mindview.util.TextFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class E26_ReadOrder {
    public static void main(String[] args){
        Map<String,ArrayList<Integer>> map = new HashMap<>();
        int countWord = 0;
        for(String word:new TextFile("H:\\IDEAProject\\thinkinjava\\src\\holding\\E24_ReFill.java","\\W+")){
            ArrayList<Integer> loc = map.get(word);
            if(loc == null){
                loc = new ArrayList<>();
                map.put(word,loc);
            }
            loc.add(countWord++);
        }

        Map<Integer,String> map2 = new TreeMap<>();
        for(Map.Entry<String,ArrayList<Integer>> entry: map.entrySet()){
            for(Integer pos:entry.getValue()){
                map2.put(pos,entry.getKey());
            }
        }
        System.out.println(map);
        System.out.println(map2);
    }
}
