package Arrays;

public class Matrix_Interchange {
     public static void main(String []args) {
    	 int [][]arr= {{1,2,3,4},
    			         {4,3,2,1},
    			         {6,7,8,9}};
    	 interchange(arr,3,4);
     }
     
     public static void interchange(int a[][],int r, int c){
         
         // Your code here
         
         for(int i = 0;i<r;i++){
             for(int j = 0;j<c;j++){
                 if(j==0){
                     int temp=a[i][j];
                     a[i][j]=a[i][c-1];
                     a[i][c-1]=temp;
                 }
             }
             
         } 
         for(int i=0;i<r;i++){
             for(int j=0;j<c;j++){
                 System.out.print(a[i][j]+" ");
             }
             System.out.println();
         }
     }
}
