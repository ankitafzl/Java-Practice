package Practice;

public class Merge_two_strings {
    public static void main(String []args) {
    	String str1="Hello";
    	String str2="Bye";
    	System.out.println(merge(str1,str2));
    }
	
	public static String merge(String S1, String S2)
    { 
        // code here
        String ans="";
        for(int i=0;i<S1.length()||i<S2.length();i++){
            if(i<S1.length()){
                ans+=S1.charAt(i);
            }
            if(i<S2.length()){
                ans+=S2.charAt(i);
            }
        }
        return ans;
    }
}
