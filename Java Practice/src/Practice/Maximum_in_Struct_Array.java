package Practice;
import java.util.*;
class Height {
	int feet;
	int inches;
	public Height(int ft, int inc)
	{
	    feet = ft;
	    inches = inc;
	}
}


public class Maximum_in_Struct_Array {
	
	public static void main(String args[]) {
		int n=2;
		Height []arr= new Height[n];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++) {
			int temp1=sc.nextInt();
			int temp2=sc.nextInt();
			arr[i]=new Height(temp1,temp2);
		}
		System.out.println(findMax(arr,n));
	}
	
	public static int findMax(Height arr[], int n)
    {
       // your code here
       int max=0,res;
       for(int i=0;i<n;i++){
           res=(arr[i].feet)*12+arr[i].inches;
           if(max<res){
               max=res;
           }
       }
       return max;
    }
}
