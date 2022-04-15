package Arrays;

public class Count_the_number_of_subarrays {

	public static void main(String args[]) {
		int arr[]={1, 4, 6};
		System.out.println(countSubarray(arr.length,arr,3,8));
	}
	
    public static long countSubarray(int N,int A[],long L,long R) {
        // code here
        long ans1=countTheNumberOfSubarray(N,A,R);
        long ans2=countTheNumberOfSubarray(N,A,L-1);
        return (ans1-ans2);
        
    }
    
    public static long countTheNumberOfSubarray(int N,int A[],long k){
        long sum=0,res=0;
        for(int i=0,j=0;i<N;i++){
            sum+=A[i];
            while(sum>k){
                sum=sum-A[j++];
            }
            res+=(i-j+1);
        }
        return res;
    }
}
