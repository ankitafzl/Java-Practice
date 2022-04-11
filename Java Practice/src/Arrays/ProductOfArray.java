package Arrays;

public class ProductOfArray {
      public static void main(String []args) {
    	  int arr[]= {2,7,4,6,9,1,5};
    	  System.out.println(getProduct(arr,arr.length));
      }
      
      public static int getProduct(int []arr,int n) {
    	  int prod=1;
    	  for(int i=0;i<n;i++) {
    		  prod*=arr[i];
    	  }
    	  return prod;
      }
}
