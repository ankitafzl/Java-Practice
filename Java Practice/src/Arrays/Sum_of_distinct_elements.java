package Arrays;
import java.util.HashSet;
public class Sum_of_distinct_elements {
	public static void main(String [] args){
	   	  int arr[]={1, 2, 3, 4, 5};
	   	  System.out.println(findSum(arr,arr.length));
	     }
	
	
	public static int findSum(int arr[], int n) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(int i:set){
            sum+=i;
        }
        return sum;
    }
}
