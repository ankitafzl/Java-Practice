package Practice;

public class Minimum_Deletions {

	public static void main(String [] args){
	   	  String str="aebcbda";
	   	  System.out.println(minimumNumberOfDeletions(str));
	     }
	
	public static int minimumNumberOfDeletions(String S) {
        //your code here
        int n=S.length();
        String str=new StringBuilder(S).reverse().toString();
        
        return n - longestPalindromeSubsequence(S, str, n);
        
    }
    public static int longestPalindromeSubsequence(String S,String str,int n){
        int dp[][]=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(S.charAt(i-1)==str.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n][n];
    }
}
