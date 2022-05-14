package Arrays;

public class Sum_of_All_Odd_Length_Subarrays {

	
	public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=(((i+1)*(n-i)+1)/2)*arr[i];
        }
        return sum;
    }
}
