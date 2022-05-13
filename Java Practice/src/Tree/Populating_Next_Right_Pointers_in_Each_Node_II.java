package Tree;

public class Populating_Next_Right_Pointers_in_Each_Node_II {

   class Node{
	public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
  }
	
	 public  Node connect(Node root) {
	        Node head=root;
	        if(root==null){
	            return null;
	        }
	        while(head!=null){
	            Node dummy=new Node(0);
	            Node temp=dummy;
	            while(head!=null){
	                if(head.left!=null){
	                    temp.next=head.left;
	                    temp=temp.next;
	                }
	                if(head.right!=null){
	                    temp.next=head.right;
	                    temp=temp.next;
	                }
	                head=head.next;
	            }
	            head=dummy.next;
	        }
	        return root;
	    }
}
