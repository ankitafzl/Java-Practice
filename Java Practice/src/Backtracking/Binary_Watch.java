package Backtracking;
import java.util.*;
public class Binary_Watch {

	public List<String> readBinaryWatch(int turnedOn) {
        ArrayList<String> ans=new ArrayList<>();
        
        for(int i=0;i<12;i++){
            for(int j=0;j<60;j++){
                if(Integer.bitCount(i)+Integer.bitCount(j)==turnedOn){
                    if(j<10){
                        ans.add(String.format("%d:0%d",i,j));
                    }
                    else{
                        ans.add(String.format("%d:%d",i,j));
                    }
                }
            }
        }
        return ans;
    }
}
