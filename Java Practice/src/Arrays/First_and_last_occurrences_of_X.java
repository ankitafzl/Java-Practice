package Arrays;
import java.util.ArrayList;
public class First_and_last_occurrences_of_X {
    public static void main(String args[]) {
        int	arr[] = { 1, 3, 3, 4 };
        System.out.println(firstAndLast(arr,arr.length,3));
    }
    
    public static  ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        // Code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                list.add(i);
                break;
            }
           
        }
        if(list.size() == 0) {
           list.add(-1);
        }
        else {
           for(int i=n-1;i>=0;i--) {
               if(arr[i]==x) {
                   list.add(i);
                   break;
                }
            }
        }
        return list;
    }
}
