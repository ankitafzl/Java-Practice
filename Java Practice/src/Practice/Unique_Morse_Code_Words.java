package Practice;
import java.util.*;
public class Unique_Morse_Code_Words {
	 String morse[]=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	    public int uniqueMorseRepresentations(String[] words) {
	        Set<String> set=new HashSet<>();
	        
	        for(String str:words){
	            StringBuilder sb=new StringBuilder();
	            for(char ch:str.toCharArray()){
	                sb.append(morse[ch-'a']);
	            }
	           set.add(sb.toString());
	        }
	        return set.size();
	    }
}
