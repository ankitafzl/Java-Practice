package Arrays;
import java.util.*;
public class Pythagorean_Triplet {
	public static void main(String [] args){
	  	  int arr[]={3, 2, 4, 6, 5};
	  	  System.out.println(checkTriplet(arr,arr.length));
	    }
	
	
	 public static boolean checkTriplet(int[] arr, int n) {
	        // code here
	        Arrays.sort(arr);
	        
	        for(int i=n-1;i>=0;i--){
	            int l_side=0;
	            int r_side=i-1;
	            while(l_side<r_side){
	                int l_pow=(int)Math.pow(arr[i],2);
	                int r_pow=(int)Math.pow(arr[l_side],2)+(int)Math.pow(arr[r_side],2);
	                
	                if(l_pow==r_pow){
	                    return true;
	                }
	                else if(l_pow<r_pow){
	                    r_side--;
	                }
	                else{
	                    l_side++;
	                }
	            }
	        }
	        return false;
	    }
}
