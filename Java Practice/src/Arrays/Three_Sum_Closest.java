package Arrays;
import java.util.Arrays;
public class Three_Sum_Closest {

	 public int threeSumClosest(int[] nums, int target) {
	        Arrays.sort(nums);
	        int sum=nums[0]+nums[1]+nums[nums.length-1];
	        for(int i=0;i<nums.length-2;i++){
	            int low=i+1;
	            int high=nums.length-1;
	            int temp=0;
	            while(low<high){
	                temp=nums[i]+nums[low]+nums[high];
	                if(temp>target){
	                    high--;
	                }
	                else{
	                    low++;
	                }
	                if(Math.abs(sum-target)>Math.abs(temp-target)){
	                    sum=temp;
	                }
	            }
	        }
	        return sum;
	    }
}
