package Arrays;
import java.util.Stack;
public class Immediate_Smaller_Element {
     public static void main(String []args) {
    	 int arr[] = {4, 2, 1, 5, 3};
    	 immediateSmaller(arr,arr.length);
    	 for(int i:arr) {
    		 System.out.print(i+" ");
    	 }
     }
     
    public static  void immediateSmaller(int arr[], int n) {
         // code here
         Stack<Integer> stack=new Stack<>();
         for(int i=0;i<n-1;i++){
             stack.push(arr[i]);
             if(stack.peek()>arr[i+1]){
                 arr[i]=arr[i+1];
             }
             else{
                 arr[i]=-1;
             }
         }
         arr[n-1]=-1;
     }
}
