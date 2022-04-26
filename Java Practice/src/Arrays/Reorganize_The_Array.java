package Arrays;

public class Reorganize_The_Array {
    public static void main(String []args) {
    	int[] arr={-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
  	  
 	   Rearrange(arr,arr.length);
 	   for(int i:arr) {
 		   System.out.print(i+" ");
 	   }
    }
	
	public static int[] Rearrange (int arr[], int n) {
        // Complete the function
        
        int i=0;
        int j=n-1;
        while(i<=j){
            if(arr[i]!=i && arr[i]!=-1 ){
                int temp=arr[arr[i]];
                arr[arr[i]]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            }
        }
        return arr;
    }
    
}
