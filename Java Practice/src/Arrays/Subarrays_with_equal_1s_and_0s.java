package Arrays;
import java.util.*;
public class Subarrays_with_equal_1s_and_0s {

	public static void main(String []args) {
    	int arr[]= {1,0,0,1,0,1,1};
    	System.out.println(countSubarrWithEqualZeroAndOne(arr,arr.length));
    }
	
	public static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int res=0;
        int sum=0;
        for(int i:arr){
            if(i==0){
                sum+=-1;
            }
            else{
                sum+=1;
            }
            if(map.containsKey(sum)){
                res+=map.get(sum);
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        return res;
    }
}
