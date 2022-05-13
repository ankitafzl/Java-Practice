package Stack;
import java.util.*;
public class Reverse_First_K_elements_of_Queue {

	public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        
        Stack<Integer> stack=new Stack<>();
        Queue<Integer> ans=new LinkedList<>();
        int count=0;
        while(!q.isEmpty()){
            count++;
            stack.push(q.poll());
            if(count==k){
                break;
            }
        }
        while(!stack.isEmpty()){
            ans.add(stack.pop());
        }
        while(!q.isEmpty()){
            ans.add(q.poll());
        }
        
        return ans;
    }
}
