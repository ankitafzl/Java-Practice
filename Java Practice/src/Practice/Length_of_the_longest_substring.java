package Practice;
import java.util.*;
public class Length_of_the_longest_substring {

	public static void main(String [] args){
	   	  String str="geeksforgeeks";
	   	  System.out.println(longestUniqueSubsttr(str));
	}
	
	public static int longestUniqueSubsttr(String S){
        Map<Character,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int len=0;
        while(j<S.length()){
            if(map.containsKey(S.charAt(j))){
                i=Math.max(map.get(S.charAt(j))+1,i);
            }
            map.put(S.charAt(j),j);
            len=Math.max(len,j-i+1);
            j++;
        }
        return len;
    }
}
