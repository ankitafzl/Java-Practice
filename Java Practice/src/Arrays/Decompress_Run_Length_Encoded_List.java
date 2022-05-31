package Arrays;

public class Decompress_Run_Length_Encoded_List {

	public int[] decompressRLElist(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                count+=nums[i];
            }
        }
        int[] ans=new int[count];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                for(int j=0;j<nums[i];j++){
                    ans[k++]=nums[i+1];
                }
                i++;
            }
        }
        return ans;
    }
}
