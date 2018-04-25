package holding;


import java.util.*;

public class E11_Collection {
    public static void printToString(Collection<?> collection){
        Iterator<?> it = collection.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
    }
    public static void main(String[] args){
        List<Collection<String>> ca = Arrays.asList(
                new ArrayList<>(),
                new LinkedHashSet<>(),
                new HashSet<>(),
                new TreeSet<>()
        );
        for(Collection<String> c:ca)
            E04_MoiveNameGenarator.fill(c);
        for(Collection<String> c:ca)
            printToString(c);
    }
}
