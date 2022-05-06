package LinkedList;

public class Split_a_Circular_Linked_List_into_two_halves {

	static Node head, head1, head2;
	 
    static class Node {
 
        int data;
        Node next, prev;
 
        Node(int d) {
            data = d;
            next = prev = null;
        }
    }
 
    
    static void splitList() {
        Node slow_ptr = head;
        Node fast_ptr = head;
 
        if (head == null) {
            return;
        }
 
        /* If there are odd nodes in the circular list then
         fast_ptr->next becomes head and for even nodes
         fast_ptr->next->next becomes head */
        while (fast_ptr.next != head && fast_ptr.next.next != head) {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }
 
        /* If there are even elements in list then move fast_ptr */
        if (fast_ptr.next.next == head) {
            fast_ptr = fast_ptr.next;
        }
 
        /* Set the head pointer of first half */
        head1 = head;
 
        /* Set the head pointer of second half */
        if (head.next != head) {
            head2 = slow_ptr.next;
        }
        /* Make second half circular */
        fast_ptr.next = slow_ptr.next;
 
        /* Make first half circular */
        slow_ptr.next = head;
    }
 
    /* Function to print nodes in a given singly linked list */
    static void printList(Node node) {
        Node temp = node;
        if (node != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != node);
        }
    }
 
    public static void main(String[] args) {
        //LinkedList list = new LinkedList();
 
        //Created linked list will be 12->56->2->11
        head = new Node(12);
        head.next = new Node(56);
        head.next.next = new Node(2);
        head.next.next.next = new Node(11);
        head.next.next.next.next = head;
 
        System.out.println("Original Circular Linked list ");
        printList(head);
 
        // Split the list
        splitList();
        System.out.println("");
        System.out.println("First Circular List ");
        printList(head1);
        System.out.println("");
        System.out.println("Second Circular List ");
        printList(head2);
         
    }
}
