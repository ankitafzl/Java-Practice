package Matrix;

public class Count_Negative_Numbers_in_a_Sorted_Matrix {

	 public int countNegatives(int[][] grid) {
	        int count=0;
	        for(int i=0;i<grid.length;i++){
	            int st=0;
	            int end=grid[0].length-1;
	            while(st<=end){
	                int mid=(st+end)/2;
	                if(grid[i][mid]<0){
	                    count=count+end-mid+1;
	                    end=mid-1;
	                }
	                else{
	                    st=mid+1;
	                }
	            }
	        }
	        return count;
	    }
}
