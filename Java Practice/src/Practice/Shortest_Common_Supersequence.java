package Practice;

public class Shortest_Common_Supersequence {
	public static void main(String [] args){
	   	  String str1="abcd";
	   	  String str2="xycd";
	   	  System.out.println(shortestCommonSupersequence(str1,str2,str1.length(),str2.length()));
	   	 
    }
	
	 public static int shortestCommonSupersequence(String X,String Y,int m,int n)
	    {
	        //Your code here
	        int ans=longestCommonSubsequence(X,Y,m,n);
	        return ans+(m-ans)+(n-ans);
	        
	    }
	    
	    
	    private static int longestCommonSubsequence(String X,String Y,int m,int n){
	        int dp[][]=new int[m+1][n+1];
	        for(int i=1;i<=m;i++){
	            for(int j=1;j<=n;j++){
	                if(X.charAt(i-1)==Y.charAt(j-1)){
	                    dp[i][j]=dp[i-1][j-1]+1;
	                }
	                else{
	                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
	                }
	            }
	        }
	        return dp[m][n];
	    }
}
