package Arrays;
import java.util.*;
public class Sort_by_Set_Bit_Count {
     public static void main(String []args) {
    	Integer arr[] = {5, 2, 3, 9, 4, 6, 7, 15, 32};
    	
    	sortBySetBitCount(arr, arr.length);
    	for(int i:arr) {
       	 System.out.print(i+" ");
        }
     }
     
     
     public static void sortBySetBitCount(Integer arr[], int n)
     { 
         // Your code goes here
         Arrays.sort(arr,(x,y)->Integer.compare(Integer.bitCount(y),Integer.bitCount(x)));
     } 
}
