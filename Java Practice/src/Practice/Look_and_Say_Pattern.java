package Practice;

public class Look_and_Say_Pattern {

	
	 public static void main(String []args)
     {
  	   int n=5;
  	  
  	   System.out.print(look_and_say(n));
     }
	
	public static String look_and_say(int n) {
        //your code here
        if(n==1){
            return "1";
        }
        else if(n==2){
            return "11";
        }
       String str = look_and_say(n-1);
       String ans = new String();
       int count = 1;
       for(int i=0;i< str.length()-1;i++) {
           if(str.charAt(i+1) == str.charAt(i)) {
               count++;
           }
           else {
               ans = ans + count + (str.charAt(i) -'0');
               count = 1;
           }
       }
       ans = ans + count + (str.charAt(str.length()-1) -'0');
       return ans;
    }
}
