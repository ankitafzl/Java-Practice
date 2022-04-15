package Arrays;

public class Rod_cutting {
	
	public static void main(String []args) {
		int price[] = {3, 5, 8, 9, 10, 17, 17, 20};
		System.out.println(cutRod(price,price.length));
	}

	public static int cutRod(int price[], int n) {
        //code here
        int dp[]=new int[n+1];
        dp[1]=price[0];
        for(int i=2;i<n+1;i++){
            int ans=-1;
            for(int j=1;j<i;j++){
                ans=Math.max(ans,dp[j]+price[i-j-1]);
            }
            dp[i]=Math.max(ans,price[i-1]);
        }
        return dp[n];
    }
	
}
