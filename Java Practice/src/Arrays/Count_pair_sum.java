package Arrays;

public class Count_pair_sum {
	public static void main(String [] args){
	  	  int arr[]={5,9,3,15,1,2};
	  	int brr[]={5,9,3,15,1,2};
	  	  System.out.println(countPairs(arr,brr,arr.length,brr.length,10));
	    }
	
	public static int countPairs(int arr1[],int arr2[], int M, int N, int x) 
    { 
        //code here.
        
        int sum,count = 0;
        int m = 0, n = N-1;
       while(m != M && n != -1){
           sum = arr1[m] + arr2[n] ;
           if(sum == x){
               count++;
               m++;
           }
           else if(x>sum){
               m++;
           }
           else {
               n--;
           }
       }
       
       return count;
    }
}
