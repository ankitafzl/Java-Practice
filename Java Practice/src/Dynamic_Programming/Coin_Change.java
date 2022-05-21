package Dynamic_Programming;
import java.util.Arrays;
public class Coin_Change {

	public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        
        for(int i:coins){
            for(int j=i;j<=amount;j++){
                dp[j]=Math.min(dp[j],dp[j-i]+1);
            }
        }
        if(dp[amount]<=amount){
            return dp[amount];
        }
        return -1;
    }
}
