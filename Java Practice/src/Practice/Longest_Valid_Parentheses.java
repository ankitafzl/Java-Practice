package Practice;
import java.util.*;
public class Longest_Valid_Parentheses {

	 public int longestValidParentheses(String s) {
	        Stack<Character> stack=new Stack<>();
	        Stack<Integer> index=new Stack<>();
	        index.add(-1);
	        int max=0;
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)=='('){
	                stack.add('(');
	                index.add(i);
	            }
	            else{
	                if(!stack.isEmpty() && stack.peek()=='('){
	                    stack.pop();
	                    index.pop();
	                    max=Math.max(max,i-index.peek());
	                }
	                else{
	                    index.add(i);
	                }
	            }
	        }
	        return max;
	    }
}
