package Arrays;

public class Power_of_2 {

    public static boolean isPowerofTwo(long n){
        
        // Your code here
        boolean ans = false;
        while(n>0){
            if(n%2==1 && ans==false){
                ans = true;
            }
            else if(n%2==1 && ans==true){
                ans = false;
                break;
            }
            n /=2;
        }
        return ans;
    }
}
