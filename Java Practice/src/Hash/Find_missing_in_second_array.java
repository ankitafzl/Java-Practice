package Hash;
import java.util.*;
public class Find_missing_in_second_array {
 
	 public static void main(String [] args){
		 long A[] = {1, 2, 3, 4, 5, 10};
		 long B[] = {2, 3, 1, 0, 5};
		 System.out.println(findMissing(A,B,A.length,B.length));
	 }
	
	public static ArrayList<Long> findMissing(long A[], long B[], int N, int M)
    {
        HashSet<Long> set=new HashSet<>();
        ArrayList<Long> ans=new ArrayList<>();
        for(int i=0;i<M;i++){
            set.add(B[i]);
        }
        
        for(int i=0;i<N;i++){
            if(!set.contains(A[i])){
                ans.add(A[i]);
            }
        }
        return ans;
    }
}
