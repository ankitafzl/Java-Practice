package Arrays;

public class Missing_Number {

	 public int missingNumber(int[] nums) {
	        int n=nums.length;
	        int total_sum=(n*(n+1))/2;
	        int sum=0;
	        for(int i=0;i<n;i++)
	        {
	            sum+=nums[i];
	        }    
	        int missing_num=total_sum-sum;
	        return missing_num;
	    }
}
