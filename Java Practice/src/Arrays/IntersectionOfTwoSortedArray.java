package Arrays;
import java.util.HashSet;
public class IntersectionOfTwoSortedArray {
	 public static void main(String []args) {
   	  int arr1[]= {3,4,6,8,9};
   	  int arr2[]= {1,2,4,5,9,10};
   	  getIntersection(arr1,arr2,arr1.length,arr2.length);
     }
	 
	 public static void getIntersection(int arr1[],int arr2[],int m,int n) {
		 HashSet<Integer> set=new HashSet<>();
		 int i,j;
		 i=j=0;
		 while(i<m && j<n) {
			 if(arr1[i] <arr2[j]) {
				 i++;
			 }
			 else if(arr1[i]>arr2[j]) {
				 j++;
			 }
			 else {
				 set.add(arr1[i]);
				 i++;
				 j++;
			 }
		 }
		 for(int ele:set) {
			 System.out.print(ele+" ");
		 }
	 }
}
