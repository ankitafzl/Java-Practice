package Practice;

public class Split_a_String_in_Balanced_Strings {

	 public int balancedStringSplit(String s) {
	        int left_count=0;
	        int right_count=0;
	        int count=0;
	         for(int i=0;i<s.length();i++){
	             if(s.charAt(i)=='R'){
	                 right_count++;
	             }
	             else{
	                 left_count++;
	             }
	             if(left_count==right_count){
	                 count++;
	             }
	         }
	        return count;
	    }
}
