package containers;

import net.mindview.util.CollectionData;
import net.mindview.util.Generator;

import java.util.LinkedHashSet;
import java.util.Set;

class Government implements Generator<String>{
    String[] foundation = ("he is a good boy don't you know that?").split(" ");
    private int index;
    public String next(){ return foundation[index++];}
}

public class CollectionDataTest {
    public static void main(String[] args){
        Set<String> set = new LinkedHashSet<>(new CollectionData<String>(new Government(),9));
        set.addAll(CollectionData.list(new Government(),9));
        System.out.println(set);
    }
}
