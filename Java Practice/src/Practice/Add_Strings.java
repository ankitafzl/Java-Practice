package Practice;

public class Add_Strings {

	 public String addStrings(String num1, String num2) {
	        String ans="";
	        int f=num1.length()-1;
	        int s=num2.length()-1;
	        
	        int carry=0;
	        while(f>=0 || s>=0  || carry!=0){
	            int f_val=f>=0?num1.charAt(f)-'0':0;
	            int s_val=s>=0?num2.charAt(s)-'0':0;
	            f--;
	            s--;
	            
	            int sum=f_val+s_val+carry;
	            ans=(sum%10)+ans;
	            carry=sum/10;
	        }
	        return ans;
	    }
}
