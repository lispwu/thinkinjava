package holding;

import net.mindview.util.TextFile;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class E16_CountVow {
    private static final Set<Character> vowels = new HashSet<Character>(Arrays.asList('a','e','i','o','u',
            'A','E','I','O','U'));
    public static void main(String[] args){
        Set<String> fileProcesser = new HashSet<>();

        int fileVowels = 0;
        int wordVowels;
        for(String word: new TextFile("H:\\IDEAProject\\thinkinjava\\src\\holding\\E11_collection.java","\\W+")){
            wordVowels = 0;
            for(Character letter:word.toCharArray()){
                if(vowels.contains(letter))
                    wordVowels++;
            }
            if(!fileProcesser.contains(word)){
                fileProcesser.add(word);
                System.out.println(word + " has " + wordVowels + " vowel(s)!");
            }
            fileVowels += wordVowels;
        }
        System.out.println("the total vowels of the file is " + fileVowels);
    }
}
