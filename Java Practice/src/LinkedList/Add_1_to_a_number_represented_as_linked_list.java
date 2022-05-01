package LinkedList;

public class Add_1_to_a_number_represented_as_linked_list {
     
	Node head;
	class Node{
	    int data;
	    Node next;
	    
	    Node(int x){
	        data = x;
	        next = null;
	    }
	} 
	
	 public static Node addOne(Node head) 
	    { 
	        
	        boolean x=true;
	        head=reverse(head);
	        Node current=head;
	        while(current!=null && x==true){
	            if(current.next==null && current.data==9){
	                current.data=1;
	                //Node temp=new Node(0);
//	                temp.next=head;
//	                head=temp;
	                current=current.next;
	            }
	            else if(current.data==9){
	                current.data=0;
	                current=current.next;
	            }
	            else{
	                current.data=current.data+1;
	                current=current.next;
	                x=false;
	            }
	        }
	        head=reverse(head);
	        return head;
	    }
	    
	    public static Node reverse(Node head){
	        Node current=head;
	        Node previous=null;
	        Node next=null;
	        while(current!=null){
	            next=current.next;
	            current.next=previous;
	            previous=current;
	            current=next;
	        }
	        return previous;
	    }
}
