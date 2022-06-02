package Dynamic_Programming;

public class Counting_Bits {

	 public int[] countBits(int n) {
	        int ans[]=new int[n+1];
	        for(int i=0;i<ans.length;i++){
	            ans[i]=ans[i>>1]+i%2;
	           
	        }
	         return ans;
	    }
}
