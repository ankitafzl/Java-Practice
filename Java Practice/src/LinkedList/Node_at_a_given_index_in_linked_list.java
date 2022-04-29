package LinkedList;

public class Node_at_a_given_index_in_linked_list {
    Node head;
    public class Node{
    	int data;
        Node next;
        Node(int key)
        {
            data = key;
            next = null;
        }
    }
	
	 public static int getNth(Node node, int ind)
	    {
	       //Your code here
	       int res=0;
	       while(node!=null){
	           res++;
	           if(res==ind){
	               return node.data;
	           }
	           node=node.next;
	       }
	       return -1;
	    }
}
