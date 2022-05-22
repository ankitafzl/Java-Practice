package Arrays;

public class Searching_an_element_in_a_sorted_array_Ternary_Search {

	public static int ternarySearch(int arr[], int N, int K)
    {
        // Your code here
        int left=0;
        int right=N-1;
        
        while(left<=right){
            int mid1=left+(right-left)/3;
            int mid2=right-(right-left)/3;
            
            if(arr[mid1]==K || arr[mid2]==K){
                return 1;
            }
            if(arr[mid1]>K){
                right=mid1-1;
                
            }
            else if(arr[mid2]<K){
                left=mid2+1;
                
            }
            else{
               left=mid1+1;
               right=mid2-1;
            }
        }
        return -1;
    }
}
