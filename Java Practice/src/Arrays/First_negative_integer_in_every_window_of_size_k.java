package Arrays;
import java.util.*;
public class First_negative_integer_in_every_window_of_size_k {
    public static void main(String []args) {
    	long []arr={-8, 2, 3, -6, 10};
    	printFirstNegativeInteger(arr,arr.length,2);
//    	for(long i:arr) {
//    		System.out.print(i+" ");
//    	}
    }
	
	public static long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        int i=0,j=0,x=0;
        long[] ans=new long[N-K+1];
        Queue<Long> queue=new ArrayDeque<>();
        while(j<N){
            if(A[j]<0){
                queue.add(A[j]);
            }
            if(j-i+1<K){
                j++;
            }
            else if(j-i+1==K){
                if(queue.size()!=0){
                    ans[x++]=queue.peek();
                    if(queue.peek()==A[i]){
                        queue.remove();
                    }
                }
                else{
                    ans[x++]=0;
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
