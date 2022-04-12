package Arrays;

public class IshanLovesChocolate {
	
	public static void main(String []args) {
		int arr[] = {5, 3, 1, 6, 9};
		System.out.println(chocolates(arr,arr.length));
	}
	
	 public static int chocolates (int arr[], int n) {
	        //Complete the function
	        
	        int min=arr[0];
	        for(int i=0;i<n;i++){
	            if(min>arr[i]){
	                min=arr[i];
	            }
	        }
	        return min;
	    }
}
