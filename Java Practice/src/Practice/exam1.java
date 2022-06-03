package Practice;
import java.util.Scanner;
public class exam1 {
    public static void main(String []args) {
    	Scanner sc=new Scanner(System.in);
    	int input1=sc.nextInt();
    	int input2=sc.nextInt();
    	int count=0;
    	for(int i=0;i<=input2;i++) {
    		int temp=i;
    		while(temp>0) {
    			int x=temp%10;
    			if(x==input1) {
    				count++;
    			}
    			temp/=10;
    		}
    	}
    	System.out.println(count);
    }
}
