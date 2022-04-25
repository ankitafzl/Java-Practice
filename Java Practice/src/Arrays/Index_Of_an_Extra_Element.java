package Arrays;

public class Index_Of_an_Extra_Element {
	public static void main(String [] args){
	   	  int arr1[]={2,4,6,8,9,10,12};
	   	  int arr2[]={2,4,6,8,10,12};
	   	  System.out.println(findExtra(arr1,arr2,arr1.length));
    }
	
	
	public static int findExtra(int a[], int b[], int n) {
        // add code here.
        
        int st=0,end=n-1;
        
        while(st<end){
            int mid=st+(end-st)/2;
            if(a[mid] >= b[mid]){
                st = mid + 1;
            }
            else if(a[mid] < b[mid]){
                end = mid;
            }
        }
        return st;
    }
}
