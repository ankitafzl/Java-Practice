package Practice;

public class Check_if_the_number_is_balanced {

	 public static void main(String []args)
     {
   	  String str="12345";
 		   System.out.println(balancedNumber(str)); 
     }  
	
	public static Boolean balancedNumber(String N)
    {
        // your code here  
        int f_half=0,s_half=0;
        int len=N.length();
        for(int i=0;i<len/2;i++){
            f_half+=N.charAt(i)-'0';
        }
        for(int i=len-1;i>len/2;i--){
            s_half+=N.charAt(i)-'0';
        }
        return f_half==s_half;
    }
}
