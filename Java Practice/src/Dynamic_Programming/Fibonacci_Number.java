package Dynamic_Programming;

public class Fibonacci_Number {

	public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int n1=0;
        int n2=1;
        int n3=0;
        while(n>1){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            n--;
        }
        return n3;
    }
}
