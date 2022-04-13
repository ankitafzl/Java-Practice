package Arrays;
import java.util.Arrays;
public class Swap_and_Maximize {
      public static void main(String args[]){
    	  long arr[]={4, 2, 1, 8};
    	  System.out.println(maxSum(arr,arr.length));
      }
      
      public static Long maxSum(long arr[] ,int n)
      {
      
          long sum=0;
          Arrays.sort(arr);
          sum = Math.abs(arr[0]-arr[n-1]);
          
          if(n==2){
              return 2*sum;
          }
          int i = 1;
          int j = n-2;
          while(i<j){
              long temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
              i+=2;
              j-=2;
          }
              
          for(i=0;i<n-1;i++){
              sum += Math.abs(arr[i]-arr[i+1]);
          }    
         
          return sum;
      }
}
