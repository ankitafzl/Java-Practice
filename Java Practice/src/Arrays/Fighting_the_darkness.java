package Arrays;

public class Fighting_the_darkness {

	public static void main(String [] args){
	  	  long arr[]={1, 2, 4, 1, 3};
	  	  System.out.println(maxDays(arr,arr.length));
	}
	
	public static long maxDays(long arr[], int n){
        // code here 
        long max=arr[0];
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
