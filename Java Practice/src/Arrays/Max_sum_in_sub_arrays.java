package Arrays;

public class Max_sum_in_sub_arrays {

	public static void main(String [] args){
	   	  long arr[]={5,9,3,15,1,2};
	   	  System.out.println(pairWithMaxSum(arr,arr.length));
	}
	
	public static long pairWithMaxSum(long arr[], long N)
    {
        // Your code goes here
        
        long max=arr[0];
        for(int i=0;i<N-1;i++){
            if(arr[i]+arr[i+1]>max){
                max=arr[i]+arr[i+1];
            }
        }
        return max;
    }
}
