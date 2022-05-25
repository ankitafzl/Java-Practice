package Dynamic_Programming;
import java.util.*;
public class Russian_Doll_Envelopes {

	 public int maxEnvelopes(int[][] envelopes) {
	        int n=envelopes.length;
	        int dp[]=new int[n];
	        int max=0;
	        
	        Arrays.sort(envelopes,(a,b)->a[0]==b[0]?b[1]-a[1]:a[0]-b[0]);
	        for(int i=0;i<dp.length;i++){
	            int ind=binary_search(dp,0,max,envelopes[i][1]);
	            dp[ind]=envelopes[i][1];
	            if(ind==max){
	                max++;
	            }
	        }
	        return max;
	    }
	    
	    int binary_search(int []arr,int st, int end,int target){
	        while(st<end){
	            int mid=st+(end-st)/2;
	            if(arr[mid]==target){
	                return mid;
	            }
	            else if(arr[mid]>target){
	                end=mid;
	            }
	            else{
	                st=mid+1;
	            }
	        }
	        return st;
	    }
}
