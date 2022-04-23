package Practice;
import java.util.ArrayList;
import java.util.Stack;
public class Print_Bracket_Number {

	public static void main(String []args) {
    	String str= "aebcbda";
    	
    	System.out.println(barcketNumbers(str));
    	
     }
	
	public static ArrayList<Integer> barcketNumbers(String S) {
        // code here
        
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        int j = 0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == '('){
                j++;
                stack.push(j);
                list.add(j);
            }else if(S.charAt(i) == ')'){
                list.add(stack.peek());
                stack.pop();
            }
        }
        
        return list;
    }
}
