package Practice;
import java.util.HashMap;
public class Second_most_repeated_string_in_a_sequence {
    public static void main(String args[]) {
    	String  arr[] = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
    	System.out.println(secFrequent(arr,arr.length));
    }
	
	public static String secFrequent(String arr[], int N)
    {
        // your code here
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++){
            if(map.containsKey(arr[i])==true){
                int x=map.get(arr[i]);
                map.put(arr[i],x+1);
            }else {
                map.put(arr[i],1);
            }
        }
        
        int max=0;
        int val=0;
        String ans ="";
        for(String k : map.keySet()) {
        	if(map.get(k)>max)max=map.get(k);
        }
        
        for(String a : map.keySet()) {
        	if(map.get(a)<max && map.get(a)>val) {
        	    val=map.get(a); 
        	    ans=a;
        	    
        	}
        }
        
        return ans;
    }
}
