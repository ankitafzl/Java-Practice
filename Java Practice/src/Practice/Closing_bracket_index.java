package Practice;

public class Closing_bracket_index {

	 public static void main(String []args)
     {
   	  String str="[ABC[23]][89]";
 		   System.out.println(closing(str,0)); 
     }  
	
	public static int closing (String s, int pos)
    {
        // your code here     
       int c=0;
       int i;
       int len=s.length();
       for(i=pos;i<len;i++)
       {
           if(s.charAt(i)=='[')
           {
               c++;
           }
           else if(s.charAt(i)==']')
           {
               c--;
           }
           
           if(c==0)
           {
              break;
           }
       }
       
       return i;

    }
}
