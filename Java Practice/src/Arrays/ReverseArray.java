package Arrays;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String [] args)
    {
   	 Scanner sc=new Scanner(System.in);
   	 System.out.print("Enter the size of an array : ");
   	 int a=sc.nextInt();
   	 
   	 int a1[]=new int[a];
   	 System.out.println("Enter an array : ");
   	
   	 for(int i=0;i<a;i++)
             a1[i]=sc.nextInt();
        int temp;
   	 int l=0,r=a-1;
   	 while(l<r)
   	 {
   		 temp=a1[l];
   		 a1[l]=a1[r];
   		 a1[r]=temp;
   		 l++;
   		 r--;
   	 }
   	 System.out.print("printing array after reverse : ");
   	 for(int j=0;j<a;j++)
   	 {
   		 System.out.print(a1[j]);
   	 }
  }
}
//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
