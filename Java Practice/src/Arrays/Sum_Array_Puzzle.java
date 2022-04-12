package Arrays;

public class Sum_Array_Puzzle {
	
	public static void main(String []args) {
		int arr[]= {3 ,6, 4, 8, 9};
		SumArray(arr,arr.length);
	}
	
	public static void SumArray(int arr[], int n)
    {
        // your code here
        int sum=0;
        for(int i=0; i<n; i++){
           sum+=arr[i];
        }
        for(int i=0; i<n; i++){
            arr[i]=sum-arr[i];
            System.out.print(arr[i]+" ");
        }
        return;
    }
}
