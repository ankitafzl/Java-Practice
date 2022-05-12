package Arrays;

public class Maximum_Product_of_Two_Elements_in_an_Array {

	 public int maxProduct(int[] nums) {
	        int first=Integer.MIN_VALUE;
	        int second=first;
	        for(int i:nums){
	            if(i>=first){
	                second=first;
	                first=i;
	            }
	            else if(i>second){
	                second=i;
	            }
	        }
	        return (first-1)*(second-1);
	    }
}
