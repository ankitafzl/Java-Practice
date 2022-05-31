package Arrays;

public class Find_Numbers_with_Even_Number_of_Digits {

	 public int findNumbers(int[] nums) {
	        int ans=0;
	        for(int i=0;i<nums.length;i++){
	            int digit=0;
	            while(nums[i]>0){
	                digit++;
	                nums[i]/=10;
	            }
	            if(digit%2==0){
	                ans++;
	            }
	        }
	        return ans;
	    }
}
