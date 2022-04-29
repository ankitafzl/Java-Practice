package LinkedList;

public class Identical_Linked_Lists {
     Node head;
     class Node{
    	 int data;
    	 Node next;
    	 
    	 public Node(int d) {
    		 data=d;
    		 next=null;
    	 }
     }
     
     public static boolean identical(Node head1 , Node head2) {
    	 Node node1=head1;
    	 Node node2=head2;
    	 while(node1!=null || node2!=null){
             if(node1!=null && node2!=null){
                 if(node1.data == node2.data){
                     node1=node1.next;
                     node2=node2.next;
                     continue;
                 
                 }
                 else{
                     return false;
                 }
                 
             }
             else{
                     return false;
             }
             
         }
         return true;
    
     }
//     
//     public static void printLinkedList(Node head) {
//
//         Node printIt = head;
//         while(printIt != null){
//             System.out.print(printIt.data + " -> ");
//             printIt = printIt.next;
//         }
//
//         System.out.println();
//     }

     public  void insertNode(int d) {
         Node newNode = new Node(d);
         if(head == null){
             head = newNode ;
             return;
         }

         Node temp = head;

         while (temp.next != null) {
             temp = temp.next;            
         }

         temp.next = newNode;

     }
     
     public static void main(String []args) {
    	 
    	 Identical_Linked_Lists sll1=new Identical_Linked_Lists();
    	 Identical_Linked_Lists sll2=new Identical_Linked_Lists();
    	 
    	 sll1.insertNode(5);
    	 sll1.insertNode(6);
    	 sll1.insertNode(7);
    	 sll2.insertNode(5);
    	 sll2.insertNode(6);
    	 sll2.insertNode(7);
    	 
//    	 if (sll1.identical(sll2) == true)
//             System.out.println("Identical ");
//         else
//             System.out.println("Not identical ");
     }
}
