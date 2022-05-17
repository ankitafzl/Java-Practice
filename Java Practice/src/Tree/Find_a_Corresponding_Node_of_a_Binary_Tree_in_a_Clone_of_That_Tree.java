package Tree;

public class Find_a_Corresponding_Node_of_a_Binary_Tree_in_a_Clone_of_That_Tree {
	
	public class TreeNode {
		     int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }

	public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original != null){
            if(original==target){
                return cloned;
            }
            TreeNode x=getTargetCopy(original.left,cloned.left,target);
            if(x!=null){
               return x; 
            }
            return getTargetCopy(original.right,cloned.right,target);
        }
        return null;
    }
}
