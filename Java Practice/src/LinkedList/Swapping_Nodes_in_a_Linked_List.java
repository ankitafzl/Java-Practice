package LinkedList;

public class Swapping_Nodes_in_a_Linked_List {

	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { 
		    	  this.val = val;
		    	  }
		      ListNode(int val, ListNode next) { 
		    	  this.val = val;
		    	  this.next = next;
		    	  }
		  }
	public ListNode swapNodes(ListNode head, int k) {
        ListNode ptr1=head;
        ListNode ptr2=null;
        ListNode ans=head;
        while(--k>0){
            head=head.next;
        }
        ptr2=head;
        while(head.next!=null){
            ptr1=ptr1.next;
            head=head.next;
        }
        int temp=ptr1.val;
        ptr1.val=ptr2.val;
        ptr2.val=temp;
        return ans;
    }
}
