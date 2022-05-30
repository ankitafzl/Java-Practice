package Practice;

public class Divide_Two_Integers {

	public int divide(int dividend, int divisor) {
        if(dividend == 1<<31 && divisor==-1){
            return Integer.MAX_VALUE;
        }
        boolean s=(dividend>=0) == (divisor>=0) ? true:false;
        dividend=Math.abs(dividend);
        divisor=Math.abs(divisor);
        int ans=0;
        while(dividend-divisor>=0){
            int count=0;
            while(dividend-(divisor<<1<<count)>=0){
                count++;
            }
            ans+=1<<count;
            dividend-=divisor<<count;
        }
        return s?ans:-ans;
    }
}
