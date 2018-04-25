package holding;

import net.mindview.util.TextFile;

import java.util.*;

public class E20_CountVowels {
    private static final Set<Character> vowels = new HashSet<Character>(Arrays.asList('a','e','i','o','u',
            'A','E','I','O','U'));
    static void updateStat(Map<Character,Integer> map,Character letter){
        Character ch = Character.toLowerCase(letter);
        Integer freq = map.get(ch);
        map.put(ch, freq == null? 1:freq + 1);
    }
    public static void main(String[] args){
        Set<String> fileProcesser = new HashSet<>();
        Map<Character,Integer> wordCount = new HashMap<>();
        Map<Character,Integer> fileCount = new HashMap<>();
        for(String word: new TextFile("H:\\IDEAProject\\thinkinjava\\src\\holding\\E11_collection.java","\\W+")){
            wordCount.clear();
            for(Character letter:word.toCharArray()) {
                if (vowels.contains(letter)) {
                    updateStat(wordCount, letter);
                    updateStat(fileCount, letter);
                }
            }
            if(!fileProcesser.contains(word)){
                fileProcesser.add(word);
                System.out.println(word + " has " + wordCount);
            }
        }
        System.out.println("the total vowels of the file is " + fileCount);
    }
}
