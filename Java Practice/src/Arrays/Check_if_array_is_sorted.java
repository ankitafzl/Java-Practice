package Arrays;

public class Check_if_array_is_sorted {
	
	public static void main(String args[]) {
		int arr[]= {3,5,8,9,10};
		System.out.println(arraySortedOrNot(arr,arr.length));
	}
	
	 public static boolean arraySortedOrNot(int[] arr, int n) {
	        // code here
	        boolean flag=false;
	        if(arr.length==1){
	           return true;
	       }
	        for(int i=0;i<n-1;i++){
	            if(arr[i]<=arr[i+1]){
	                flag=true;
	            }
	            else{
	                flag=false;
	                break;
	            }
	        }
	        return flag;
	    }
}
