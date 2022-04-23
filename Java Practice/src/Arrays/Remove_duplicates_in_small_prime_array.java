package Arrays;
import java.util.*;
public class Remove_duplicates_in_small_prime_array {
	public static void main(String []args) {
    	int arr[] = {2,3,2,5,3,7};
    	
    	System.out.println(removeDuplicate(arr, arr.length));
    	
     }
	
	public static ArrayList<Integer> removeDuplicate(int arr[], int n)
    {
        // code here 
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        return list;
    }
}
