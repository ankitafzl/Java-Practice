package Practice;
import java.util.*;
public class Sort_Characters_By_Frequency {
	 public String frequencySort(String s) {
	        HashMap<Character,Integer> map=new HashMap<>();
	        for(char ch:s.toCharArray()){
	            map.put(ch,map.getOrDefault(ch,0)+1);
	        }
	        
	        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
	        pq.addAll(map.keySet());
	        StringBuilder ans=new  StringBuilder();
	        while(!pq.isEmpty()){
	            char ch=pq.remove();
	            for(int i=0;i<map.get(ch);i++){
	                ans.append(ch);
	            }
	        }
	        return ans.toString();
	    }
}
