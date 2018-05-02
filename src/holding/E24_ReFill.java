package holding;


import net.mindview.util.Countries;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class E24_ReFill {
    public static void main(String[] args){
        Map<String,String> map1 = new LinkedHashMap<>(Countries.capitals(20));
        System.out.println(map1);
        String[] keys = map1.keySet().toArray(new String[0]);
        Arrays.sort(keys);
        Map<String,String> map2 = new LinkedHashMap<>();
        for(String key:keys){
            map2.put(key,map1.get(key));
        }
        System.out.println(map2);
    }
}
