package Arrays;

public class Stickler_Thief {
    public static void main(String []args) {
    	int arr[]= {5,10,5,100};
    	System.out.println(sticklerThief(arr,arr.length));
    }
    
    public static int sticklerThief(int []arr,int n) {
    	int dp[]=new int [n];
    	if(n==1) {
    		return arr[0];
    	}
    	dp[0]=arr[0];
    	dp[1]=Math.max(arr[0],arr[1]);
    	for(int i=2;i<n;i++) {
    		dp[i]=Math.max(arr[i]+dp[i-2], dp[i-1]);
    	}
    	return dp[n-1];
    }
}
