package Practice;

public class Check_string {
	public static void main(String []args) {
		String str1="Geeks";
		String str2="gggg";
		System.out.println(check(str1));
		System.out.println(check(str2));
	}
	
	public static Boolean check (String s)
    {
        // your code here       
        for(int i=1;i<s.length();i++){
            if(s.charAt(0)!=s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
