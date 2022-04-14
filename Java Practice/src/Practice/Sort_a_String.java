package Practice;
import java.util.Arrays;
public class Sort_a_String {
     public static void main(String []args) {
    	 String str="edcab";
    	 System.out.println(sort(str));
     }
     
     public static String sort(String s) 
     {
         
         char ch[]=s.toCharArray();
         Arrays.sort(ch);
         return new String(ch);
     }
}
