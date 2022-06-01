package Stack;
import java.util.*;
public class N_ary_Tree_Preorder_Traversal {

	class Node {
	    public int val;
	    public List<Node> children;

	    public Node() {}

	    public Node(int _val) {
	        val = _val;
	    }

	    public Node(int _val, List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	}
	
	List<Integer> ans=new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root==null){
            return ans;
        }
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node current=stack.pop();
            ans.add(current.val);
            for(int i=current.children.size()-1;i>=0;i--){
                stack.push(current.children.get(i));
            }
        }
        return ans;
    }
}
