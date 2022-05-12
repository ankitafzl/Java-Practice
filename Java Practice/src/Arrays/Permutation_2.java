package Arrays;
import java.util.*;
public class Permutation_2 {

	public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> res=new HashSet<>();
        permute_method(nums,0,res);
        return new ArrayList(res);
    }
    
    private void permute_method(int []nums,int start,Set<List<Integer>> res){
        if(start==nums.length){
            res.add(array_to_list(nums));
        }
        for(int i=start;i<nums.length;i++){
            int temp;
            temp=nums[i];
            nums[i]=nums[start];
            nums[start]=temp;
            permute_method(nums,start+1,res);
            temp=nums[i];
            nums[i]=nums[start];
            nums[start]=temp;
        }
    }
    private List<Integer> array_to_list(int nums[]){
        List<Integer> list=new ArrayList<>();
        for(int i:nums){
            list.add(i);
        }
        return list;
    }
}
