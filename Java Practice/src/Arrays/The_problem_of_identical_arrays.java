package Arrays;
import java.util.Arrays;
public class The_problem_of_identical_arrays {

	
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
