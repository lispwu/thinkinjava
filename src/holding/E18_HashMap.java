package holding;

import net.mindview.util.Countries;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class E18_HashMap {
    public static void main(String[] args){
        Map<String,String> map1 = new HashMap<>(Countries.capitals(10));
        System.out.println(map1);

        String[] keys = map1.keySet().toArray(new String[0]);
        Arrays.sort(keys);

        Map<String,String> map2 = new HashMap<>();
        for(String key:keys){
            map2.put(key,map1.get(key));
        }
        System.out.println(map2);
    }

}
