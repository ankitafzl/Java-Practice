package Arrays;
import java.util.Arrays;
public class Min_sum_formed_by_digits {

	public static void main(String [] args){
	  	  int arr[]={6, 8, 4, 5, 2, 3};
	  	  System.out.println(minSum(arr,arr.length));
	}
	
	public static long minSum(int arr[], int n)
    {
        // Your code goes here
        Arrays.sort(arr);
        long num1=0,num2=0,ans;
        for(int i=0;i<n;i++){
            if(i%2==0){
                num1=num1*10+arr[i];
            }
            else{
                num2=num2*10+arr[i];
            }
        }
        ans=num1+num2;
        return ans;
    }
}
