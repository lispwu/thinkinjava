package holding;

import java.util.*;

public class E05_IntegerListFeatures {
    public static void main(String[] args){
        Random rand = new Random(47);
        List<Integer> ins = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println("1: " + ins);
        ins.add(8);
        System.out.println("2: " + ins);
        System.out.println("3: " + ins.contains(8));
        ins.remove(Integer.valueOf(8));
        Integer i = ins.get(2);
        System.out.println("4: " + i + " " + ins.indexOf(i));
        Integer j = Integer.valueOf(1);
        System.out.println("5: " + ins.indexOf(j));
        System.out.println("6: " + ins.remove(j));
        System.out.println("7: " + ins.remove(i));
        System.out.println("8: " + ins);
        ins.add(3,0);
        System.out.println("9: " + ins);
        List<Integer> sub = ins.subList(1,4);
        System.out.println("subList: " +  sub);
        System.out.println("10: " + ins.containsAll(sub));
        Collections.sort(sub);
        System.out.println("sorted List: " + sub);
        System.out.println("11: " + ins.containsAll(sub));
        Collections.shuffle(sub,rand);
        System.out.println("shuffled List: " + sub);
        System.out.println("12: " + ins.containsAll(sub));
        List<Integer> copy = new ArrayList<>(ins);
        sub = Arrays.asList(ins.get(1),ins.get(4));
        System.out.println("12.5: " + copy);
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<>(ins);
        copy.remove(2);
        System.out.println("14: " + copy);
        copy.removeAll(sub);
        System.out.println("15: " + copy);
        copy.set(1,9);
        System.out.println("16: " + copy);
        copy.addAll(2,sub);
        System.out.println("17: " + copy);
        System.out.println("18: " + ins.isEmpty());
        ins.clear();
        System.out.println("19: " + ins);
        System.out.println("20: " + ins.isEmpty());
        ins.addAll(Arrays.asList(1,2,3,4));
        System.out.println("21: " + ins);
        Object[] o = ins.toArray();
        System.out.println("22: " + o[3]);
        Integer[] ia = ins.toArray(new Integer[0]);
        System.out.println("23: " + ia);



    }
}
