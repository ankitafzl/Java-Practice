package Arrays;
import java.util.Arrays;
public class The_problem_of_identical_arrays1 {

	public static void main(String [] args){
	  	  int arr[]={5,9,3,15,1,2};
	  	int brr[]={5,9,3,15,1,2};
	  	  System.out.println(check(arr,brr,arr.length));
	    }
	
	
	public static int check (int arr[], int[] brr, int n) {
        //Complete the function
        
        if(arr.length!=brr.length){
            return 0;
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        
        for(int i=0;i<n;i++){
            if(arr[i]!=brr[i]){
                return 0;
            }
        }
        return 1;
    }
}
