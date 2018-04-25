package holding;

import net.mindview.util.TextFile;

import java.util.*;

public class E21_CountWord {
    /**
     * 对String出现的次数进行计数
     * @param map
     * @param str
     */
    static void updateStat(Map<String,Integer> map,String str){
        String s = str.toLowerCase();
        Integer freq = map.get(s);
        map.put(s, freq == null? 1 : freq + 1);
    }

    public static void main(String[] args){
        Map<String,Integer> countWord = new HashMap<>();
        for(String word: new TextFile("H:\\IDEAProject\\thinkinjava\\src\\holding\\E11_collection.java","\\W+")){
            updateStat(countWord,word);
        }
        List<String> list = new ArrayList<>(countWord.keySet());
        Collections.sort(list,String.CASE_INSENSITIVE_ORDER);
        for(String str:list){
            System.out.println(str + " => " + countWord.get(str));
        }
    }
}
