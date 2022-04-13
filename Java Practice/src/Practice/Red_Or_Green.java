package Practice;

public class Red_Or_Green {
     public static void main(String []args) {
    	 String str="RGRGR";
    	 System.out.println(RedOrGreen(str,str.length()));
     }
     
    public static int RedOrGreen(String S,int N) {
         //code here
         
         int gCount=0;
         int rCount=0;
         for(int i=0;i<N;i++){
             if(S.charAt(i)=='R'){
                 rCount++;
             }
             else{
                 gCount++;
             }
         }
         int ans=Math.min(rCount,gCount);
         return ans;
     }
}
