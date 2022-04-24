package Arrays;

public class Rearrange_Geek_and_his_Classmates {

	
	public static void main(String [] args){
	   	  long arr[]={0, 5, 1, 2, 4, 3};
	   	  prankn(arr,arr.length);
	   	  for(long i:arr) {
	   		  System.out.print(i+" ");
	   	  }
	}
	
	
	public static void prankn(long[] a, int n)  
    { 
        // code here
        long[] arr=new long[n];
        for(int i=0;i<n;i++)
        {
           long temp=a[i];
           arr[i]= a[(int)temp];
        }
        for(int i=0;i<n;i++)
        {
           a[i]=arr[i];
        }
    }
}
