package Graph;
import java.util.*;
public class Critical_Connections_in_a_Network {

	int t=0;
    List<List<Integer>> ans;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<Integer>[] adj=new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }
        for(List<Integer> e:connections){
            int x=e.get(0);
            int y=e.get(1);
            adj[x].add(y);
            adj[y].add(x);
            
        }
        boolean[] v=new boolean[n];
        int []time_stamp=new int[n];
        ans=new ArrayList<>();
        dfs(adj,v,time_stamp,0,-1);
        return ans;
    }
    
    void dfs(List<Integer>[] adj,boolean []v,int []time_stamp,int vertex,int previous){
        v[vertex]=true;
        time_stamp[vertex]=t++;
        int curr_time_stamp=time_stamp[vertex];
        for(int x:adj[vertex]){
            if(x==previous){
                continue;
            }
            if(!v[x]){
                dfs(adj,v,time_stamp,x,vertex);
            }
            time_stamp[vertex]=Math.min(time_stamp[vertex],time_stamp[x]);
            if(curr_time_stamp<time_stamp[x]){
                ans.add(Arrays.asList(vertex,x));
            }
        }
    }
}
