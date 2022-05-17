package Arrays;

public class Majority_Element {

	public int majorityElement(int[] nums) {
        Integer x=null;
        int count=0;
        for(int i:nums){
            if(count==0){
                x=i;
            }
            count += x == i?1:-1;
        }
        return x;
    }
}
