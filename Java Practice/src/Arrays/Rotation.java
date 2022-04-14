package Arrays;

public class Rotation {
    public static void main(String []args) {
    	int []arr= {5, 1, 2, 3, 4};
    	System.out.println(findKRotation(arr,arr.length));
    }
	
	public static int findKRotation(int arr[], int n) {
        
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            int previous=mid==0 ? n-1:(mid-1);
            int next=mid==n-1 ? 0:(mid+1);
            if(arr[mid]<=arr[next] && arr[mid]<=arr[previous]){
                return mid;
            }
            else if(arr[mid]>arr[high]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return 0;
    }
	
}
