package Arrays;
import java.util.*;
public class Intersection_of_Two_Arrays_II {

      public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        
        for(int i=0;i<nums1.length;i++){
            if(map1.containsKey(nums1[i])){
                map1.put(nums1[i],map1.get(nums1[i])+1);
            }
            else{
                map1.put(nums1[i],1);
            }
        }
        
        for(int i=0;i<nums2.length;i++){
            if(map2.containsKey(nums2[i])){
                map2.put(nums2[i],map2.get(nums2[i])+1);
            }
            else{
                map2.put(nums2[i],1);
            }
        }
        
        List<Integer> temp=new ArrayList<>();
        for(Integer key:map1.keySet()){
            if(map2.containsKey(key)){
                int min=Math.min(map1.get(key),map2.get(key));
                while(min-->0){
                    temp.add(key);
                }
            }
        }
        
        int n=temp.size();
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=temp.get(i);
        }
        return ans;
    }
}
