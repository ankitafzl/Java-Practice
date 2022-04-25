package Arrays;

public class Sort_by_Absolute_Difference {

	public static void main(String []args)
    {
  	  int[] arr={10, 5, 3, 9, 2};
  	       sortABS(arr,arr.length,7);
		   for(int i:arr){
			   System.out.print(i+" ");
			   
		   }   
    }    
	
	
	public static void sortABS(int arr[], int n,int k)
    {
        // add your code here
        sort(arr,0,n-1,k);
    }
    
    private static void sort(int []arr,int start,int end,int k){
        int mid=start+(end-start)/2;
        if(start<end){
            sort(arr,start,mid,k);
            sort(arr,mid+1,end,k);
            merge(arr,start,mid,end,k);
        }
    }
    
    private static void merge(int []arr,int start,int mid,int end,int k){
        int index = start;
        int num1 = mid - start + 1;
        int num2 = end - mid;
        int[] l = new int[num1], r = new int[num2];

        for (int i = 0; i < num1; i++) {
            l[i] = arr[start + i];
        }

        for (int i = 0; i < num2; i++) {
            r[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0;
        while (i < num1 && j < num2) {
            int l_Abs = Math.abs(l[i] - k);
            int r_Abs = Math.abs(r[j] - k);
            if (l_Abs <= r_Abs) {
                arr[index++] = l[i++];
            } else if (l_Abs > r_Abs) {
                arr[index++] = r[j++];
            }
        }
        while (i < num1) {
            arr[index++] = l[i++];
        }
        while (j < num2){
            arr[index++] = r[j++];
        } 
    }
}
