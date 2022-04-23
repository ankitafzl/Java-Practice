package Arrays;
import java.util.HashMap;
public class Non_Repeating_Element {

	public static void main(String []args) {
    	int arr[] = {-1, 2, -1, 3, 2};
    	
    	System.out.println(firstNonRepeating(arr, arr.length));
    	
     }
	
	public static  int firstNonRepeating(int arr[], int n) 
    { 
        // Complete the function
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
            
        }
        for(int i=0;i<n;i++){
            if(map.get(arr[i])==1){
                return arr[i];
            }
        }
        return 0;
    }  
    
}
