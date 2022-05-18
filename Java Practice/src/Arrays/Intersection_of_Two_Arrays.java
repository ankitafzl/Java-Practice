package Arrays;
import java.util.*;
public class Intersection_of_Two_Arrays {

	public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        
        for(Integer i:nums1){
            set1.add(i);
        }
        
        for(Integer i:nums2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }
        int len=set2.size();
        int []ans=new int[len];
        int ind=0;
        for(Integer i:set2){
            ans[ind++]=i;
        }
        return ans;
    }
}
