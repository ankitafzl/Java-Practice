package Arrays;
import java.util.*;
public class Shortest_Distance_to_a_Character {

	public int[] shortestToChar(String s, char c) {
        List<Integer> list=new ArrayList<>();
        int n=s.length();
        list.add(-1000);
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                list.add(i);
            }
        }
        list.add(Integer.MAX_VALUE);
        int []ans=new int[n];
        
        int first=list.get(0);
        int second=list.get(1);
        
        int x=2;
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=c){
                ans[i]=Math.min(i-first,second-i);
            }
            else{
                first=second;
                second=list.get(x++);
            }
        }
        return ans;
    }
}
