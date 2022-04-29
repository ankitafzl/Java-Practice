package Arrays;

public class Trapping_Rain_Water {
	
	public static void main(String [] args){
	   	  int arr[]={3,0,0,2,0,4};
	   	  System.out.println(trappingWater(arr,arr.length));
	     }
	
	public static long trappingWater(int arr[], int n) { 
        // Your code here
        int []l_side=new int[n];
        int []r_side=new int[n];
        l_side[0]=arr[0];
        r_side[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            l_side[i]=Math.max(l_side[i-1],arr[i]);
        }
        for(int i=n-2;i>=0;i--){
            r_side[i]=Math.max(r_side[i+1],arr[i]);
        }
        long ans=0;
        for(int i=0;i<n;i++){
            ans+=(Math.min(l_side[i],r_side[i])-arr[i]);
        }
        return ans;
    } 
}
