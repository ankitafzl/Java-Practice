package Practice;

public class The_Penalty_Shootout {
    public static void main(String []args) {
    	String str="1012012112110";
    	System.out.println(penaltyScore(str));
    }
	
	public static int penaltyScore(String S)
    {
        // Your code goes here 
        int count=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='2'){
                if(i+1<S.length() && S.charAt(i+1)=='1'){
                    count++;
                }
            }
        }
        return count;
    }
}
