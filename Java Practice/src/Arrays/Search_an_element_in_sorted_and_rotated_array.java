package Arrays;

public class Search_an_element_in_sorted_and_rotated_array {

	public static void main(String [] args){
	   	  int arr[]={5,6,7,8,9,10,1,2,3};
	   	  System.out.println(Search(arr,10));
	}
	
	public static int Search(int array[], int target)
	{
	    // code here
	    int n=array.length;
	    int left=0;
	    int right=n-1;
	    while(left<=right){
	        int mid=(left+right)/2;
	        if(array[mid]==target){
	            return mid;
	        }
	        else if(array[mid]>array[left]){
	            if(target>=array[left] && target<array[mid]){
	                right=mid-1;
	            }
	            else{
	                left=mid+1;
	            }
	        }
	        else{
	            if(target<=array[right] && target>array[mid]){
	                left=mid+1;
	            }
	            else{
	                right=mid-1;
	            }
	        }
	    }
	    return -1;
	}
}
