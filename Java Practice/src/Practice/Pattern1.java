package Practice;

public class Pattern1 {
    public static void main(String []args) {
    	for(int i=1;i<=4;i++) {
    		for(int j=i;j>0;j--) {
    			System.out.print(j+" ");
    		}
    		System.out.println();
    	}
    	System.out.println();
    	for(int i=1;i<=4;i++) {
    		for(int j=1;j<=i;j++) {
    			System.out.print(j+" ");
    		}
    		System.out.println();
    	}
    	System.out.println();
    	
    	for(int i=1;i<=4;i++) {
    		for(int j=1;j<=i;j++) {
    			System.out.print(i+" ");
    		}
    		System.out.println();
    	}
    	System.out.println();
    	
    
    }   
}
