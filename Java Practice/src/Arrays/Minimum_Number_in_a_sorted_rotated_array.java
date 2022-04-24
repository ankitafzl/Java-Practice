package Arrays;

public class Minimum_Number_in_a_sorted_rotated_array {

	 public static void main(String [] args){
	   	  int arr[]={2,3,4,5,6,7,8,9,10,1};
	   	  System.out.println(minNumber(arr,0,arr.length-1));
	     }
	
	public static int minNumber(int arr[], int low, int high)
    {
        // Your code here
         int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
      
           if(arr[mid]>arr[ans]){
               low = mid+1;
           } 
           else {
               ans = mid;
               high = mid-1;
           }
       }
       return arr[ans];
    }
}
