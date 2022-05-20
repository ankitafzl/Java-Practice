package Arrays;
import java.util.*;
public class Baseball_Game {

    public int calPoints(String[] ops) {
        ArrayList<Integer> ans=new ArrayList<>();
        int sum=0;
        for(int i=0;i<ops.length;i++){
            if(!ops[i].equals("+") && !ops[i].equals("D") && !ops[i].equals("C")){
           
                int score=Integer.valueOf(ops[i]);
                sum+=score;
                ans.add(score);
            }
            else if(ops[i].equals("+")){
                int score=ans.get(ans.size()-1)+ans.get(ans.size()-2);
                sum+=score;
                ans.add(score);
            }
            
            else if(ops[i].equals("D")){
                int score=2*ans.get(ans.size()-1);
                sum+=score;
                ans.add(score);
            }
            else{
                sum-=ans.get(ans.size()-1);
                ans.remove(ans.size()-1);
            }
        }
        return sum;
    }
}
