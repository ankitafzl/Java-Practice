package Arrays;

public class ArraySort {
	 public static void main(String []args)
     {
   	  int[] arr={1,0,1,2,0,0,1,2,2,2};
 		   sortArray(arr);
 		   for(int i:arr){
 			   System.out.println(i);
 			   
 		   }   
     }      
   
   public static void sortArray(int[] arr)
   {
   	  int i=0,j=0;
   	  int n=arr.length-1;
   	  while(j<=n)
   	  {
   		  switch(arr[j])
   		  {
   		  case 0 :
   		           arr[i] += arr[j] - (arr[j]=arr[i]);
   		           i++;
   		           j++;
   		           break;
   		  case 1 : j++;
   		           break;
   		  case 2 : 
   		           arr[j] += arr[n] - (arr[n]=arr[j]);
   		           n--;
   		  
   		  }
   	  }
   } 	  
}
