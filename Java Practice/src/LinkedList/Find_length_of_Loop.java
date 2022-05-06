package LinkedList;
import java.util.HashMap;
public class Find_length_of_Loop {
    Node head;
	class Node
	{
	    int data;
	    Node next;
	    Node(int d) {data = d; next = null; }
	}
	
	public static int countNodesinLoop(Node head)
    {
        //Add your code here.
         int count=0;
        HashMap<Node,Integer> map = new HashMap<Node,Integer>();
        while(head!=null)
        {
           if(map.containsKey(head))
           {
               return Math.abs(map.get(head)-count);
           }
           else
           {
               map.put(head,count);
           }
         
           count++;
           head = head.next;
        }
        return 0;
        
    }
}
