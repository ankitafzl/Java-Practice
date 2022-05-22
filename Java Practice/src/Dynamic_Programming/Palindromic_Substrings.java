package Dynamic_Programming;

public class Palindromic_Substrings {

	public int countSubstrings(String s) {
        int n=s.length();
        boolean dp[][]=new boolean[n][n];
        int count=0;
        
        for(int i=0;i<n;i++){
            for(int j=0,k=i;k<dp.length;j++,k++){
                if(i==0){
                    dp[j][k]=true;
                }
                else if(i==1){
                    if(s.charAt(j)==s.charAt(k)){
                        dp[j][k]=true;
                    }
                    else{
                       dp[j][k]=false; 
                    }
                }
                else{
                    if(s.charAt(j)==s.charAt(k) && dp[j+1][k-1]==true){
                        dp[j][k]=true;
                    }
                    else{
                        dp[j][k]=false;
                    }
                }
                if(dp[j][k]==true){
                    count++;
                }
            }
        }
        return count;
    }
}
