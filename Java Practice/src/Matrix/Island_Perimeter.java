package Matrix;

public class Island_Perimeter {

	 public int islandPerimeter(int[][] grid) {
	        int perimeter=0;
	        int row=grid.length,col=grid[0].length;
	        
	        for(int i=0;i<row;i++){
	            for(int j=0;j<col;j++){
	                if(grid[i][j]==0){
	                    continue;
	                }
	                perimeter+=4;
	                if(i>0){
	                    perimeter-=grid[i-1][j];
	                }
	                if(j>0){
	                    perimeter-=grid[i][j-1];
	                }
	                if(i<row-1){
	                    perimeter-=grid[i+1][j];
	                }
	                if(j<col-1){
	                    perimeter-=grid[i][j+1];
	                }
	            }
	        }
	        return perimeter;
	    }
}
