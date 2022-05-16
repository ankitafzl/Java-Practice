package Graph;
import java.util.*;
public class Shortest_Path_in_Binary_Matrix {

	int [][]d={{0,1},{0,-1},{1,0},{1,1},{1,-1},{-1,0},{-1,1},{-1,-1}};
    public int shortestPathBinaryMatrix(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        if(grid[0][0]==1 || grid[m-1][n-1]==1){
            return -1;
        }
        Queue<int[]> q=new LinkedList<>();
        boolean v[][]=new boolean[m][n];
        
        q.add(new int[]{0,0});
        v[0][0]=true;
        int count=0;
         
        while(!q.isEmpty()){
            int len=q.size();
            for(int i=0;i<len;i++){
                int []p=q.poll();
                if(p[0]==m-1 && p[1]==n-1){
                    return count+1;
                }
                for(int[] dir:d)
                {
                    int a=dir[0]+p[0];
                    int b=dir[1]+p[1];
                    if(a>=0 && a<m && b>=0 && b<n && grid[a][b]==0 && !v[a][b]){
                        q.add(new int[]{a,b});
                        v[a][b]=true;
                    }
                }
            }
            count++;
        }
        return -1;
    }

}
