package Matrix;

public class Range_Sum_Query_2D_Immutable {

	 private int mat[][];
	    public Range_Sum_Query_2D_Immutable(int[][] matrix) {
	        if(matrix.length==0){
	            return;
	        }
	        int m=matrix.length;
	        int n=matrix[0].length;
	        mat=new int[m+1][n+1];
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                mat[i+1][j+1]=mat[i+1][j]+mat[i][j+1]-mat[i][j]+matrix[i][j];
	            }
	        }
	    }
	    
	    public int sumRegion(int row1, int col1, int row2, int col2) {
	        return mat[row2+1][col2+1]-mat[row2+1][col1]-mat[row1][col2+1]+mat[row1][col1];
	    }
}
