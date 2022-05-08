package Dynamic_Programming;

public class Maximum_difference_of_zeros_and_ones_in_binary_string {

	public static void main(String [] args){
	   	  String str="11000010001";
	   	  System.out.println(maxSubstring(str));
	}
	
	public static int maxSubstring(String S) {
        // code here
        int max=Integer.MIN_VALUE;
        int curr_max=0;
        for(int i=0;i<S.length();i++){
            int x=(S.charAt(i)=='0')?1:-1;
            curr_max +=x;
            if(curr_max>max){
                max=curr_max;
            }
            if(curr_max<0){
                curr_max=0;
            }
        }
        return max;
    }
}
