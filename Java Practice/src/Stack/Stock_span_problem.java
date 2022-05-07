package Stack;
import java.util.Stack;
public class Stock_span_problem {
	public static void main(String args[]) {
		int price[]= {100,80,60,70,60,75,85};
		calculateSpan(price,price.length);
		
	}

	public static int[] calculateSpan(int price[], int n)
    {
       
        int[] ans=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(stack.size()!=0 && price[stack.peek()]<=price[i]){
                stack.pop();
            }
            ans[i]=stack.size()==0?-1:stack.peek();
            stack.push(i);
        }
        
        for(int i=0;i<n;i++){
            ans[i]=i-ans[i];
        }
        
        
        return ans;
    }
}
