package Practice;
//import java.util.Scanner;
public class Exam2_Wipro {
   public static void main(String []args) {
	   //Scanner sc=new Scanner(System.in);
	   String input="ww:ii:pp:rr:oo:zx:za:ee";
	   StringBuilder ans=new StringBuilder();
	   String[] str=input.split(":");
	   for(String s:str) {
		   char ch1='#';
		   char ch2='#';
		   for(char ch:s.toCharArray()) {
			   if(Character.isLowerCase(ch)){
				   if(ch1=='#') {
					   ch1=ch;
				   }
				   else {
					   ch2=ch;
				   }
			   }
			   if(ch1==ch2) {
				   ans.append(ch1);
			   }
			   else {
				   int x1=ch1;
				   int x2=ch2;
				   int x3=Math.abs(x2-x1);
				   char temp=(char)(x3+'a'-1);
				   ans.append(temp);
			   }
		   }
	   }
	   System.out.println(ans.toString().toUpperCase());
   }
}
