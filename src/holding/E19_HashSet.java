package holding;

import net.mindview.util.Countries;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class E19_HashSet {
    public static void main(String[] args){
        Set<String> set1 = new HashSet<>(Countries.names(10));
        System.out.println(set1);
        String[] element = set1.toArray(new String[0]);
        Arrays.sort(element);
        Set<String> set2 = new LinkedHashSet<>();
        for(String s:element)
            set2.add(s);
        System.out.println(set2);
    }
}
