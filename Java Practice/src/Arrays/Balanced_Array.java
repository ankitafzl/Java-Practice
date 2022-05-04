package Arrays;

public class Balanced_Array {
    
	 public static void main(String [] args){
	   	  long arr[]={5,9,3,15,1,2};
	   	  System.out.println(minValueToBalance(arr,arr.length));
	  }
	
	public static long minValueToBalance(long a[] ,int n)
    {
        int low=0,high=n-1;
        long l_sum=0,r_sum=0;
        while(low<=high){
            l_sum+=a[low];
            r_sum+=a[high];
            low++;
            high--;
        }
        long ans=Math.abs(l_sum-r_sum);
        return ans;
    }
}
