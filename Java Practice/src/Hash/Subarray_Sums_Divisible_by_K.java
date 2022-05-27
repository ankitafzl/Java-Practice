package Hash;
import java.util.*;
public class Subarray_Sums_Divisible_by_K {

	 public int subarraysDivByK(int[] nums, int k) {
	        HashMap<Integer,Integer> map=new HashMap<>();
	        map.put(0,1);
	        int run_sum=0;
	        int count=0;
	        for(int i=0;i<nums.length;i++){
	            run_sum+=nums[i];
	            int rem=run_sum%k;
	            if(rem<0){
	                rem+=k;
	            }
	            if(map.containsKey(rem)){
	                count+=map.get(rem);
	            }
	            map.put(rem,map.getOrDefault(rem,0)+1);
	        }
	        return count;
	    }
}
