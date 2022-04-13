package Practice;
import java.util.HashMap;
public class Exceptionally_odd {
	public static void main(String  args[]) {
		int arr[]= {1,2,3,1,3,2,3};
		System.out.println(getOddOccurrence(arr,arr.length));
	}
	
	public static int getOddOccurrence(int[] arr, int n) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                int x=map.get(arr[i]);
                map.put(arr[i],x+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(Integer i:map.keySet()){
            if(map.get(i)%2!=0){
                return i;
            }
        }
        return -1;
    }
}
