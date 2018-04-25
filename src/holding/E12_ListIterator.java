package holding;


import java.util.*;

public class E12_ListIterator {
    static void reverse1(List<Integer> list){
        ListIterator<Integer> it1 = list.listIterator();
        ListIterator<Integer> it2 = list.listIterator(list.size());
        int mid = list.size() >> 1;
        for(int i = 0;i < mid;i++){
            Integer tmp = it1.next();
            it1.set(it2.previous());
            it2.set(tmp);
        }
    }
    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = new LinkedList<>(list1);

        list2.add(5);
        System.out.println(list2);

        reverse1(list1);
        reverse1(list2);

        System.out.println(list1);
        System.out.println(list2);
    }
}
