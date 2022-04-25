package Arrays;

public class Rearrange_an_array_with_O_1_extra_space {

	public static void main(String []args)
    {
  	  long[] arr={1,0};
  	  arrange(arr,arr.length);
		   for(long i:arr){
			   System.out.print(i+" ");
			   
		   }   
    }  
	
	 public static void arrange(long arr[], int n)
	    {
	        // your code here
	        
	        for(int i=0;i<n;i++){
	            int p=(int)arr[i];
	            int q=(int)arr[p];
	            arr[i]=p+(q%n)*n;
	        }
	        
	        for(int i=0;i<n;i++){
	            arr[i]/=n;
	        }
	    }
	
}
