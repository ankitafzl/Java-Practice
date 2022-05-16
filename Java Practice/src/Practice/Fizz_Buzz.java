package Practice;
import java.util.*;
public class Fizz_Buzz {

	public List<String> fizzBuzz(int n) {
	       String[] ans=new String[n];
	        for(int i=1;i<n+1;i++){
	            if(i%15==0){
	                ans[i-1]="FizzBuzz";
	            }
	            else if(i%3==0){
	                ans[i-1]="Fizz";
	            }
	            else if(i%5==0){
	                ans[i-1]="Buzz";
	            }
	            else{
	                ans[i-1]=Integer.toString(i);
	            }
	        }
	        return Arrays.asList(ans);
	    }
}
