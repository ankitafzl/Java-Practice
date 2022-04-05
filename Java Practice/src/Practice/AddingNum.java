package Practice;

public class AddingNum {
    public static void main(String []args) {
    	int num=153;
    	int rem,sum=0;
    	while(num>0) {
    		rem=num%10;
    		sum+=rem;
    		num/=10;
    	}
    	System.out.println(sum);
    }
}
