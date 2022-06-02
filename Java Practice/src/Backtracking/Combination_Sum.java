package Backtracking;
import java.util.*;
public class Combination_Sum {

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(candidates,0,target,new ArrayList<>(),ans);
        return ans;
    }
    
    private void solve(int[] candidates,int st,int target,List<Integer> list,List<List<Integer>> ans){
        if(target<0){
            return;
        }
        if(target==0){
            ans.add(new ArrayList<>(list));
        }
        for(int i=st;i<candidates.length;i++){
            list.add(candidates[i]);
            solve(candidates,i,target-candidates[i],list,ans);
            list.remove(list.size()-1);
        }
    }
}
