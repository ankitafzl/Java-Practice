package Arrays;

public class Sum_Array {
     public static void main(String []args) {
    	 int arr[]= {3,5,1,6,8,9};
    	 System.out.println(getSum(arr,arr.length));
     }
     
     public static int getSum(int arr[],int n) {
    	 int sum=0;
    	 for(int i=0;i<n;i++) {
    		 sum+=arr[i];
    	 }
    	 return sum;
     }
}
