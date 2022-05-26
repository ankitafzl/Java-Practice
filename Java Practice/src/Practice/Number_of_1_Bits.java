package Practice;

public class Number_of_1_Bits {

	 public int hammingWeight(int n) {
	        int count=0;
	        int x=1;
	        for(int i=0;i<32;i++){
	            if((n & x)!=0){
	                count++;
	            }
	            x=x<<1;
	        }
	        return count;
	    }
}
