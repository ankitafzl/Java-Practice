package Arrays;
import java.util.*;
public class MinimumAbsolute_Difference {
    
	public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        int min_difference=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            min_difference=Math.min(arr[i]-arr[i-1],min_difference);
        }
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==min_difference){
                List<Integer> pair=new ArrayList<>();
                pair.add(arr[i-1]);
                pair.add(arr[i]);
                ans.add(pair);
            }
        }
        return ans;
    }
}
