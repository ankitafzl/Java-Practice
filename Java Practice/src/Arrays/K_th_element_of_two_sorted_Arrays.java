package Arrays;

public class K_th_element_of_two_sorted_Arrays {

	public static void main(String [] args){
	   	  int arr1[]={2, 3, 6, 7, 9};
	   	  int arr2[]={1, 4, 8, 10};
	   	  System.out.println(kthElement(arr1,arr2,arr1.length,arr2.length,5));
	  }
	
    public static long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
        int i=0,x=0,y=0;
        int arr[]=new int[n+m];
        while(x<n && y<m){
            if(arr1[x]<=arr2[y]){
                arr[i]=arr1[x];
                x++;
            }
            else{
                arr[i]=arr2[y];
                y++;
            }
            i++;
        }
        while(x<n){
            arr[i++]=arr1[x++];
        }
        
         while(y<m){
            arr[i++]=arr2[y++];
        }
        return arr[k-1];
    }
}
