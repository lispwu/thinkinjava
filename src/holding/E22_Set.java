package holding;

import net.mindview.util.TextFile;

import java.util.*;

class WordCount{
    private String word;
    private Integer frequence;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Integer getFrequence() {
        return frequence;
    }

    public void setFrequence(Integer frequence) {
        this.frequence = frequence;
    }

    public String toString(){
        return "[" + word + "," + frequence + "]";
    }
}

public class E22_Set {
    static void updateStat(Map<String,Integer> map, String str){
        String s = str.toLowerCase();
        Integer freq = map.get(s);
        map.put(s, freq == null? 1 : freq + 1);
    }

    public static void main(String[] args){
        Map<String,Integer> countWord = new HashMap<>();
        Set<WordCount> set = new HashSet<>();
        for(String word: new TextFile("H:\\IDEAProject\\thinkinjava\\src\\holding\\E11_collection.java","\\W+")){
            updateStat(countWord,word);
            WordCount wordCount = new WordCount();
            wordCount.setWord(word);
            wordCount.setFrequence(countWord.get(word));
            set.add(wordCount);
        }
        List<WordCount> list = new ArrayList<>(set);
        for(WordCount wordCount: list)
            System.out.println(wordCount);

    }

}
