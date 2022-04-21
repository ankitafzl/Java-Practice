package Arrays;

public class Segregate_0s_and_1s {
	public static void main(String []args) {
   	 int arr[]= {0, 0, 1 ,0 ,1};
   	 segregate0and1(arr,arr.length);
   	 for(int i:arr) {
   		 System.out.print(i+" ");
   	 }
   	 
    }
	
	public static void segregate0and1(int[] arr, int n) {
        // code here
        
        int j=0;
        for(int i=0;i<n;i++){
           if(arr[i]==0){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               j++;
           }
       }
    }
}
