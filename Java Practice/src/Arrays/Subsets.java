package Arrays;
import java.util.*;
public class Subsets {
	List<List<Integer>> ans=new ArrayList<List<Integer>>();
    public List<List<Integer>> subsets(int[] nums) {
        if(nums.length==0){
            return ans;
        }
        solve(0,new ArrayList<Integer>(),nums);
        return ans;
    }
    
    public void solve(int st,ArrayList<Integer> curr,int []nums){
        ans.add(new ArrayList<Integer>(curr));
        for(int i=st;i<nums.length;i++)
        {
            curr.add(nums[i]);
            solve(i+1,curr,nums);
            curr.remove(curr.size()-1);
        }    
    }
}
