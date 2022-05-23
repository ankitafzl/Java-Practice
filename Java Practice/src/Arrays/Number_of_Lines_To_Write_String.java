package Arrays;

public class Number_of_Lines_To_Write_String {

	public int[] numberOfLines(int[] widths, String s) {
        int []ans=new int[2];
        int no_of_lines=1;
        int width=0;
         for(char ch:s.toCharArray()){
             int ch_width=widths[ch-'a'];
             if(ch_width+width>100){
                 no_of_lines++;
                 width=0;
             }
             width+=ch_width;
         }
        ans[0]=no_of_lines;
        ans[1]=width;
        return ans;
    }
}
