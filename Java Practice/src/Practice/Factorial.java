package Practice;

public class Factorial {
     public static void main(String []args) {
    	 int num=5;
    	 System.out.println(getFact(num));
     }
     
     public static int getFact(int num) {
    	 if(num==0 || num==1)
    		 return 1;
    	 
    	 return num*(getFact(num-1));
     }
}
