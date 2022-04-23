package Arrays;

public class Two_Repeated_Elements {

	public static void main(String []args) {
    	int arr[] = {1,3,1,2,4,3};
    	
        int []ans=twoRepeated(arr, arr.length);
        for(int i:ans) {
        	System.out.print(i+" ");
        }
    	
     }
	
	public static int[] twoRepeated(int arr[], int N)
    {
        // Your code here
        int []ans=new int [2];
        int x=0;
        for(int i=0;i<N+2;i++){
            int current=arr[i];
            if(current<0){
                current=-1*arr[i];
            }
            if(arr[current]<0){
                ans[x++]=current;
                if(x==2){
                    return ans;
                }
            }
            else{
                arr[current]=-1*arr[current];
            }
        }
        return ans;
    }
}
