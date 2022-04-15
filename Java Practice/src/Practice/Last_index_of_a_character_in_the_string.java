package Practice;

public class Last_index_of_a_character_in_the_string {
	
	public static void main(String []args) {
		String s = "Geeks";
		char p = 'e';
		System.out.println(LastIndex(s,p));
	}
	
	public static int LastIndex(String s, char p){
        // code here
        int ans=-1;
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)==p){
                ans=i;
            }
        }
        return ans;
    }
}
