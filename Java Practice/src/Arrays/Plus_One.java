package Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class Plus_One {

	public static void main(String []args) {
	   	 int arr[]= {1 ,2 ,4};
	   	// System.out.println(increment(arr,arr.length));
	   	 
	}
	
	
	public static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int x=1;
        for(int i=N-1;i>=0;i--)
        {
            int temp=arr.get(i)+x;
            list.add(temp%10);
            x=temp/10;
        }
        if(x!=0)
            list.add(x);
        
        Collections.reverse(list);
        return list;
    }
}
