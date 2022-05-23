package Dynamic_Programming;

public class Ones_and_Zeroes {

	public int findMaxForm(String[] strs, int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for(String str:strs){
            int count[]=count(str);
            for(int i=m;i>=count[0];i--){
                for(int j=n;j>=count[1];j--){
                    dp[i][j]=Math.max(dp[i-count[0]][j-count[1]]+1,dp[i][j]);
                }
            }
        }
        return dp[m][n];
    }
    
    int[] count(String str){
        int[] count=new int[2];
        for(char ch:str.toCharArray()){
            count[ch-'0']++;
        }
        return count;
    }
}
