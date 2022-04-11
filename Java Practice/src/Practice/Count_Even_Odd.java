package Practice;

public class Count_Even_Odd {
     public static void main(String args[]) {
    	 int arr[]= {2,6,4,7,9,11,8};
    	 int countEven=0;
    	 int countOdd=0;
    	 for(int i=0;i<arr.length;i++) {
    		 if(arr[i]%2==0) {
    			 countEven++;
    		 }
    		 else {
    			 countOdd++;
    		 }
    	 }
    	 System.out.println("Number Of Even = "+countEven);
    	 System.out.println("Number Of Odd = "+countOdd);
     }
}
