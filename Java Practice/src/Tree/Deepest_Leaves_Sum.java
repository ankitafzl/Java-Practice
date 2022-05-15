package Tree;
import java.util.*;
public class Deepest_Leaves_Sum {

	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		  }

	 public int deepestLeavesSum(TreeNode root) {
	        Queue<TreeNode> queue=new LinkedList<>();
	        queue.offer(root);
	        int sum_of_leaves=0;
	        while(!queue.isEmpty()){
	            sum_of_leaves=0;
	            int len=queue.size();
	            for(int i=0;i<len;i++){
	                TreeNode curr_node=queue.poll();
	                sum_of_leaves+=curr_node.val;
	                if(curr_node.left!=null){
	                    queue.offer(curr_node.left);
	                }
	                if(curr_node.right!=null){
	                    queue.offer(curr_node.right);
	                }
	            }
	        }
	        return sum_of_leaves;
	    }
}
