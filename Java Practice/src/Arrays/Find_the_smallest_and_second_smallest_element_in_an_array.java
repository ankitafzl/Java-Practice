package Arrays;

public class Find_the_smallest_and_second_smallest_element_in_an_array {
     public static void main(String []args) {
    	 long arr[]= {2, 4, 3 ,5 ,6};
    	 System.out.println(minAnd2ndMin(arr));
    	 
     }
     
     public static long[] minAnd2ndMin(long a[])  
     {
    	 long n=a.length;
         long f_small=Integer.MAX_VALUE;
         long s_small=Integer.MAX_VALUE;
         long[] ans={-1,-1};
         for(int i=0;i<(int)n;i++){
             if(a[i]<f_small){
                 s_small=f_small;
                 f_small=a[i];
             }
             
             else if(a[i]<s_small && a[i]>f_small){
                 s_small=a[i];
             }
         }
         if(f_small !=Integer.MAX_VALUE && s_small !=Integer.MAX_VALUE){
             ans[0]=f_small;
             ans[1]=s_small;
             return ans;
         }
         return ans;
     }
}
