package LinkedList;
import java.util.HashSet;
public class Remove_duplicates_from_an_unsorted_linked_list {
 
	Node head ;
    public static class Node {

        int data ;
        Node next; 

        public Node(int d){
            data = d ;
            next = null ;
        }        
    }
	
	public Node removeDuplicates(Node head) 
    {
         // Your code here
         Node curr_node=head;
         Node pre_node=null;
         HashSet<Integer> set=new HashSet<>();
         while(curr_node!=null){
             int curr_data=curr_node.data;
             if(set.contains(curr_data)){
                 pre_node.next=curr_node.next;
             }
             else{
                 set.add(curr_data);
                 pre_node=curr_node;
             }
             curr_node=curr_node.next;
         }
         return head;
    }
}
