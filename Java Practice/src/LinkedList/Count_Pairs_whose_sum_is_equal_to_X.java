package LinkedList;
import java.util.*;
public class Count_Pairs_whose_sum_is_equal_to_X {

	class Node
	{
	    int data;
	    Node next;

	    Node(int key)
	    {
	        data = key;
	        next = null;
	    }
	}
	
	public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,int x) {
        // add your code here
         int count = 0;
         HashSet<Integer> set = new HashSet<>();
         for (int i = 0; i < head1.size(); i++) {
              set.add(x - head1.get(i));
         }

         for (int i = 0; i < head2.size(); i++) {
               if(set.contains(head2.get(i))){
                      count++;
               } 
         }
         return count;
     }
}
