package Practice;
import java.util.*;
public class Check_If_a_String_Contains_All_Binary_Codes_of_Size_K {

	public boolean hasAllCodes(String s, int k) {
        Set<String> ans=new HashSet<>();
        int st=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            count++;
            if(count==k){
                ans.add(s.substring(st,st+k));
                st++;
                count--;
            }
        }
        if(ans.size()==Math.pow(2,k)){
            return true;
        }
        return false;
    }
}
