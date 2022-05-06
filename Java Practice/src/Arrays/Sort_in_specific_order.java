package Arrays;
import java.util.*;
public class Sort_in_specific_order {
	
	public static void main(String [] args){
	  	   long arr[]={5,9,3,15,1,2};
	  	   sortIt(arr,arr.length);
	  	   for(long i:arr) {
	  		   System.out.print(i+" ");
	  	   }
	    }

	 public static void sortIt(long arr[], long n)
	    {
	        //code here.
	        ArrayList<Long> list1 = new ArrayList<Long>();
	        ArrayList<Long> list2 = new ArrayList<Long>();
	        Arrays.sort(arr);
	        for(int i=0;i<n;i++){
	            if(arr[i] % 2 == 0){
	                list1.add(arr[i]);
	            }
	            else{
	                list2.add(arr[i]);
	            }
	        }
	        int k = 0;
	        for(int i=list2.size()-1;i>=0;i--){
	            arr[k++] = list2.get(i);
	        }
	        for(int i=0;i<list1.size();i++){
	            arr[k++] = list1.get(i);
	        }
	    }
}
