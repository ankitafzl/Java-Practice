package Practice;

public class Pattern {
     public static void main(String []args) {
    	 for(int i=0;i<=5;i++) {
    		 for(int j=0;j<i;j++) {
    			 System.out.print("*"+" ");
    		 }
    		 System.out.println();
    	 }
    	 
    	 for(int i=0;i<6;i++) {
    		 System.out.print("*"+" ");
    	 }
    	 System.out.println();
    	 
    	 for(int i=5;i>0;i--) {
    		 for(int j=0;j<i;j++) {
    			 System.out.print("*"+" ");
    		 }
    		 System.out.println();
    	 }
     }
}
