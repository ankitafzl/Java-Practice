package Arrays;

public class Maximum_money {

	public static void main(String [] args){
	  	  int num=5;
	  	  System.out.println(maximizeMoney(num,10));
	}
	
	public static int maximizeMoney(int N , int K) {
        // code here
        return K*((N+1)/2);
        
    }
}
