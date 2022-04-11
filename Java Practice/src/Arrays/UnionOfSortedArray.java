package Arrays;
import java.util.HashSet;
public class UnionOfSortedArray {
      public static void main(String []args) {
    	  int arr1[]= {3,4,6,8,9};
    	  int arr2[]= {1,2,4,5,9,10};
    	  getUnion(arr1,arr2,arr1.length,arr2.length);
      }
      
      public static void getUnion(int arr1[],int arr2[],int m,int n) {
    	  HashSet<Integer> set=new HashSet<>();
    	  for(int i=0;i<m;i++) {
    		  set.add(arr1[i]);
    	  }
    	  for(int i=0;i<n;i++) {
    		  set.add(arr2[i]);
    	  }
    	  for(int ele:set) {
    		  System.out.print(ele+" ");
    	  }
      }
}
