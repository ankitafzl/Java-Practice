package Arrays;

public class Convert_array_int_Zig_Zag_fashion {

	public static void main(String [] args){
	  	  int arr[]={3, 2, 4, 6, 5};
	  	  zigZag(arr,arr.length);
	  	  for(int i:arr) {
	  		  System.out.print(i+" ");
	  	  }
	}
	
	public static void zigZag(int arr[], int n) {
        // code here
        for(int i=0;i<n-1;i++){
            if(i%2==0){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }else{
                if(arr[i]<arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
}
