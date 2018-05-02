package holding;

import net.mindview.util.TextFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class E25_Read {
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
        System.out.println(map);
    }
}
