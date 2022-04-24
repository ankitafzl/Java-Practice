package Arrays;
import java.util.HashMap;
public class Subarray_range_with_given_sum {

	public static void main(String [] args){
	   	  int arr[]={10,2,-2,-20,10};
	   	  System.out.println(subArraySum(arr,arr.length,-10));
    }
	
	public static int subArraySum(int arr[], int n, int sum)
    {
        // add your code here
        HashMap< Integer, Integer > map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        int[] a = new int[n];
        a[0] = arr[0];
        for (int i = 1; i < n; ++i){
            a[i] = arr[i] + a[i - 1];
        } 
        for (int i = 0; i < n; ++i) {
            if (map.containsKey(a[i] - sum)) {
                count += map.get(a[i] - sum);
            }
            map.merge(a[i], 1, Integer::sum);
        }
        return count;
    }
	
}
