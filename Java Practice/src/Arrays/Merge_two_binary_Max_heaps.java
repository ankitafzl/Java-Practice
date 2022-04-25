package Arrays;
import java.util.PriorityQueue;
import java.util.Collections;
public class Merge_two_binary_Max_heaps {

	public static void main(String [] args){
	   	  int arr1[]={10, 5, 6, 2};
	   	  int arr2[]={12, 7, 9};
	   	  mergeHeaps(arr1,arr2,arr1.length,arr2.length);
	   	 
  }
	
	
	 public static int[] mergeHeaps(int[] a, int[] b, int n, int m) {
	        // your code here
	        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

	        for (int i = 0; i < n; i++) {
	            pq.add(a[i]);
	        }

	        for (int i = 0; i < m; i++) {
	            pq.add(b[i]);
	        }
	        
	        int[]ans = new int[n+m];
	        int index=0;
	        while(!pq.isEmpty()){
	            ans[index] = pq.remove();
	            index++;
	        }
	        return ans;
	    }
}
