package Arrays;

public class Equilibrium_index_of_an_array {

	public static void main(String [] args){
	  	  int arr[]={1, 7, 4, 3, 4, 8, 7};
	  	  System.out.println(findEquilibrium(arr,arr.length));
	}
	
	 public static int findEquilibrium(int arr[], int n)
     {
       //add code here.
       
       int l_sum=0;
       int r_sum=0;
       for(int i=0;i<n;i++){
           l_sum+=arr[i];
       }
       for(int i=0;i<n;i++){
           if(l_sum-arr[i]==2*r_sum){
               return i;
           }
           r_sum+=arr[i];
       }
       return -1;
     }
}
