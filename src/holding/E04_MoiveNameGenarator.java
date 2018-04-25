package holding;

import net.mindview.util.Generator;

import java.util.*;

class MoiveNameGenerator implements Generator<String>{

    String[] chara = {"A","B","C","wu","song","xixi","op"};
    int next;
    @Override
    public String next() {
        String result = chara[next];
        next = (next + 1) % chara.length;
        return result;
    }
}


public class E04_MoiveNameGenarator {
    private static final MoiveNameGenerator ge = new MoiveNameGenerator();

    static String[] fill(String[] array){
        for(int i = 0;i < array.length;i++){
            array[i] = ge.next();
        }
        return array;
    }
    
    static Collection<String> fill(Collection<String> collection){
        for(int i = 0;i < 5;i++){
            collection.add(ge.next());
        }
        return collection;
    }
    
    public static void main(String[] args){
        System.out.println(Arrays.toString(fill(new String[5])));
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
    }
}
