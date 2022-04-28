package Arrays;
import java.util.*;
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
public class Find_all_pairs_with_a_given_sum {

	 public static void main(String []args)
     {
//		 int A[] = {1, 2, 4, 5, 7};
//		 int B[] = {5, 6, 3, 4, 8};
//		 
//		 GFG gfg=new GFG();
		 //System.out.println(gfg.allPairs(A,B,A.length,B.length,9));
     }     
	
	
}

class GFG{
	public static pair[] allPairs( long A[], long B[], long N, long M, long X) {
        // Your code goes here 
        ArrayList<pair> list = new ArrayList<>();
        Arrays.sort(A);
        Arrays.sort(B);
        
        int st = 0, end = (int)M-1;
        
        while(st<N && end>=0)
        {
            long sum = A[st] + B[end];
            if(sum>X)
            {
                end--;
            }
            else if(sum<X)
            {
                st++;
            }
            else
            {
                list.add(new pair(A[st], B[end]));
                end--;
                st++;
            }
        }
        
        int len = list.size();
        
        pair p[] = new pair[len];
        
        for(int i=0; i<len; i++)
        {
            p[i] = new pair(list.get(i).first, list.get(i).second);
        }
        
        return p;
    }
}
