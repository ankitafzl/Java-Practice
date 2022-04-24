package Arrays;
import java.util.ArrayList;
public class Alternate_positive_and_negative_numbers {
    public static void main(String []args) {
         int arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
         rearrange(arr,arr.length);
         for(int i:arr) {
        	 System.out.print(i+" ");
         }
    }
	
	
	public static void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                list1.add(arr[i]);
            }
            else{
                list2.add(arr[i]);
            }
        }
        int i=0,j=0,k=0;
        while(i<list1.size() && j<list2.size()){
           
            arr[k]=list1.get(i);
            k++;
            i++;
            
            arr[k]=list2.get(j);
            k++;
            j++;
          
        }
        while(i<list1.size()){
            arr[k]=list1.get(i);
            k++;
            i++;
        }
            
        while(j<list2.size()){
            arr[k]=list2.get(j);
            k++;
            j++;
        }    
    }
}
