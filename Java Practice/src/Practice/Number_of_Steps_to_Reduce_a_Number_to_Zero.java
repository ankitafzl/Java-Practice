package Practice;

public class Number_of_Steps_to_Reduce_a_Number_to_Zero {

	public int numberOfSteps(int num) {
	       if(num==0){
	           return 0;
	       }
	        if(num==1){
	            return 1;
	        }
	        if(num%2==0){
	            return 1+numberOfSteps(num/2);
	        }
	        return 1+numberOfSteps(num-1);
	    }
}
