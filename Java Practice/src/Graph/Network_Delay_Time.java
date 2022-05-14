package Graph;
import java.util.*;
public class Network_Delay_Time {

	public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
        for(int t[]:times){
            map.putIfAbsent(t[0],new HashMap());
            map.get(t[0]).put(t[1],t[2]);
        }
        boolean []v=new boolean[n+1];
        int ans=0;
        PriorityQueue<int[]> pqueue=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pqueue.add(new int[]{0,k});
        while(!pqueue.isEmpty()){
            int []data=pqueue.remove();
            int t_time=data[0];
            int curr_Node=data[1];
            if(v[curr_Node]){
                continue;
            }
            v[curr_Node]=true;
            ans=t_time;
            n--;
            if(n==0){
                return ans;
            }
            if(map.containsKey(curr_Node)){
                for(int next:map.get(curr_Node).keySet()){
                    pqueue.add(new int[]{t_time+map.get(curr_Node).get(next),next});
                }
            }
        }
        
        if(n==0){
            return ans;
        }
        return -1;
    }
}
