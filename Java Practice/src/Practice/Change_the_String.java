package Practice;

public class Change_the_String {
	
	public static void main(String []args) {
		String str="abDc";
		System.out.println(modify(str));
	}
	
	public static String modify(String s){
        String ans="";
        //for(int i=0;i<s.length();i++){
            if(s.charAt(0)>=65 && s.charAt(0)<=90){
                ans=s.toUpperCase();
            }
            else{
                ans=s.toLowerCase();
            }
       // }
        return ans;
    }
}
