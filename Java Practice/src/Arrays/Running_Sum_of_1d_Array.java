package Arrays;

public class Running_Sum_of_1d_Array {

	 public int[] runningSum(int[] nums) {
	        
	        for(int i=1;i<nums.length;i++){
	            nums[i]+=nums[i-1];
	        }
	        return nums;
	    }
}
