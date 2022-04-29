package Arrays;

public class Sum_of_Middle_Elements_of_two_sorted_arrays {

	public static void main(String [] args){
		 int Ar1[] = {1, 12, 15, 26, 38};
		 int Ar2[] = {2, 13, 17, 30, 45};
	   	  System.out.println(findMidSum(Ar1,Ar2,Ar1.length));
	}
	
	public static int findMidSum(int[] ar1, int[] ar2, int n) {
        // code here
        int st=0,end=n;
        int ans=0;
        while(st<=end){
            int f=(st+end)/2;
            int s=(2*n+1)/2-f;
            int left1=f<=0 ? Integer.MIN_VALUE:ar1[f-1];
            int left2=s<=0 ? Integer.MIN_VALUE:ar2[s-1];
            
            int right1=f >=n ? Integer.MAX_VALUE:ar1[f];
            int right2=s >=n ? Integer.MAX_VALUE:ar2[s];
            
            if(left1<=right2 && left2<=right1){
                ans=Math.max(left1,left2)+ Math.min(right1,right2);
                return ans;
            }
            else if(left1>right2){
                end=f-1;
            }else{
                st=f+1;
            }
        }
        return ans;
       
    }
}
