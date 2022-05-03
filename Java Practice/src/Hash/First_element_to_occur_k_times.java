package Hash;
import java.util.HashMap;
public class First_element_to_occur_k_times {

	public static void main(String [] args){
	  	  int arr[]={1, 7, 4, 3, 4, 8, 7};
	  	  System.out.println(firstElementKTime(arr,arr.length,2));
	}
	
  public static int firstElementKTime(int[] a, int n, int k) { 
        
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            int x=a[i];
            if(mp.containsKey(x)){
                int val=mp.get(x);
                mp.put(x,++val);
            }
            else{
                mp.put(x,1);
            }
            if(mp.get(x)==k){
                return x;
            }
        }
        return -1;
    } 
}
