package Practice;

public class Palindrome {
     public static void main(String []args) {
    	 int num=121;
    	 int sum=0,rem,temp;
    	 temp=num;
    	 while(num>0){    
    		   rem=num%10;  
    		   sum=(sum*10)+rem;    
    		   num=num/10;    
    		  }    
    		  if(temp==sum) {    
    		     System.out.println("It is palindrome");  
    		  }
    		  else   { 
    		     System.out.println("It is not palindrome");    
    		  }
     }
}
