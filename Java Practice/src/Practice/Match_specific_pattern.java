package Practice;
import java.util.*;
public class Match_specific_pattern {

	
	public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern)
	{
	    //add code here.
	    String pattern1=find_pattern(pattern,pattern.length());
	    ArrayList<String> ans=new ArrayList<>();
	    for(int i=0;i<dict.size();i++){
	        String str=dict.get(i);
	        if(str.length()!=pattern.length()){
	            continue;
	        }
	        if(pattern1.equals(find_pattern(str,str.length()))){
	            ans.add(str);
	        }
	    }
	    return ans;
	}
	public static String find_pattern(String str,int n){
	    HashMap<Character,Integer> map=new HashMap<>();
	    String pattern="";
	    int index=1;
	    for(int i=0;i<n;i++){
	        if(map.containsKey(str.charAt(i))){
	            String str1=Integer.toString(map.get(str.charAt(i)));
	            pattern+=str1;
	        }
	        else{
	            map.put(str.charAt(i),index);
	            pattern+=Integer.toString(index);
	            index++;
	        }
	    }
	    return pattern;
	}
}
