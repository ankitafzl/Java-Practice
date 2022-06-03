package Hash;
import java.util.*;
public class Find_the_sum_of_Uncommon_Alphabet {

	public static void main(String args[]) {
		char []input1= {'A','B','C'};
		char []input2= {'B','C'};
		System.out.println(solve(input1,input2));
	}
	
	public static int solve(char[] input1,char[] input2) {
		HashMap<Character,Integer> map=new HashMap<>();
		
		for(char ch : input1) {
			map.put(ch,map.getOrDefault(ch,0)+1);
		}
		
		for(char ch : input2) {
			map.put(ch,map.getOrDefault(ch,0)+1);
		}
		
		int sum=0;
		for(char key:map.keySet()) {
			if(map.get(key)==1) {
				sum+=key;
			}
		}
		int ans=0;
		
		while(sum>0 ) {
			ans+=sum%10;
			sum=sum/10;	
		}
		
		return ans;
	}
}
