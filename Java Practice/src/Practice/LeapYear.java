package Practice;

public class LeapYear {
     public static void main(String []args) {
    	 
         int year=2000;
         if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            
             System.out.println(year + " : Leap Year");
         }
  
         else {
             
             System.out.println(year + " : Non - Leap Year");
         }
     }
}
