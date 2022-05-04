package Practice;

public class LCS_of_three_strings {

	public static void main(String []args) {
		 String A = "geeks", B = "geeksfor";
				String C = "geeksforgeeks";
		System.out.println(LCSof3(A,B,C,A.length(),B.length(),C.length()));
	}

	
	public static int LCSof3(String A, String B, String C, int n1, int n2, int n3) 
    { 
        // code here
        int dp[][][]=new int[n1+1][n2+1][n3+1];
        for(int i=0;i<=n1;i++){
            for(int j=0;j<=n2;j++){
                for(int k=0;k<=n3;k++){
                    dp[i][j][k] = -1;
       
                }
            }
        }
        return solve(A,B,C,n1,n2,n3,dp);
    }
    
    public static int  solve(String A, String B, String C,int n1, int n2, int n3,int[][][] dp){
        if(n1<=0 || n2<=0 || n3<=0) {
            return 0;
            
        }
        
        if(dp[n1][n2][n3]!=-1){
            return dp[n1][n2][n3];
        } 
        
        if(A.charAt(n1-1)==B.charAt(n2-1) && B.charAt(n2-1)==C.charAt(n3-1)){
            return dp[n1][n2][n3] = 1 + solve(A,B,C,n1-1,n2-1,n3-1,dp);
        }
        else{
            int i = solve(A,B,C,n1-1,n2,n3,dp);
            int j = solve(A,B,C,n1-1,n2-1,n3,dp);
            int k = solve(A,B,C,n1-1,n2-1,n3-1,dp);
            int l = solve(A,B,C,n1,n2-1,n3,dp);
            int m = solve(A,B,C,n1,n2-1,n3-1,dp);
            int n = solve(A,B,C,n1,n2,n3-1,dp);
            
            int ans = Math.max(i,Math.max(j,Math.max(k,Math.max(l,Math.max(m,n)))));
            return dp[n1][n2][n3] = ans;
        }
    }
}
