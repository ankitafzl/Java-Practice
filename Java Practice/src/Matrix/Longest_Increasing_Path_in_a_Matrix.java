package Matrix;

public class Longest_Increasing_Path_in_a_Matrix {

	int dir[][]={{1,0},{-1,0},{0,1},{0,-1}};
    public int longestIncreasingPath(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int [][]temp=new int[m][n];
        int longest_path=0;
        if(matrix == null || matrix.length == 0){
            return 0;
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int p=dfs(matrix,m,n,i,j,temp);
                longest_path=Math.max(p,longest_path);
            }
        }
        return longest_path;
    }
    
    public int dfs(int [][]matrix,int m,int n,int i,int j,int [][]temp){
        int max=0;
        if(temp[i][j]>0){
           return temp[i][j];
        }
        for(int []d:dir){
            int x=i+d[0];
            int y=j+d[1];
            if(x>=0 && y>=0 && x<m && y<n && matrix[x][y]>matrix[i][j]){
                max=Math.max(max,dfs(matrix,m,n,x,y,temp));
            }
        }
        temp[i][j]=max+1;
        return max+1;
    }
}
