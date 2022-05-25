package Arrays;
import java.util.*;
public class Find_and_Replace_Pattern {

	public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans=new ArrayList<>();
        for(String word:words){
            if(solve(word,pattern)){
                ans.add(word);
            }
        }
        return ans;
    }
    
    private boolean solve(String words,String pattern){
        char[] word_to_pattern=new char[26];
        char[] pattern_to_word=new char[26];
        
        for(int i=0;i<words.length();i++){
            char word_char=words.charAt(i);
            char pattern_char=pattern.charAt(i);
            
            if(pattern_to_word[pattern_char-'a']==0){
                pattern_to_word[pattern_char-'a']=word_char;
            }
            
            if(word_to_pattern[word_char-'a']==0){
                word_to_pattern[word_char-'a']=pattern_char;
            }
            
            if(pattern_to_word[pattern_char-'a'] !=word_char || word_to_pattern[word_char-'a']!=pattern_char){
                return false;
            }
        }
        return true;
    }
}
