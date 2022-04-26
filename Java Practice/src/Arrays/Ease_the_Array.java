package Arrays;

public class Ease_the_Array {

	public static void main(String []args) {
    	int[] arr={2, 2, 0, 4, 0, 8};
  	  
    	modifyAndRearrangeArr (arr,arr.length);
 	   for(int i:arr) {
 		   System.out.print(i+" ");
 	   }
    }
	
	public static void modifyAndRearrangeArr (int arr[], int n) {
        // Complete the function
        int x=0;
    	for(int  i=0; i<n-1; i++)
    	{
    	    if(arr[i]==arr[i+1] && arr[i]!=0)
    	    {
    	        arr[i]=2*arr[i];
    	        arr[i+1]=0;
    	    }
    	}
    	for(int j=0; j<n; j++)
    	{
    	    if(arr[j]!=0)
    	    {
    	        int temp=arr[x];
    	        arr[x]=arr[j];
    	        arr[j]=temp;
    	        x++;
    	    }
    	}
    }
}
