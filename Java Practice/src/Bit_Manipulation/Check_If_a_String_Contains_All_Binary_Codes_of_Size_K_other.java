package Bit_Manipulation;

import java.util.HashSet;
import java.util.Set;

public class Check_If_a_String_Contains_All_Binary_Codes_of_Size_K_other {

	public boolean hasAllCodes(String s, int k) {
        Set<String> res=new HashSet<>();
        int st=0;
        int cnt=0;
        for(int i=0;i<s.length();i++){
            cnt++;
            if(cnt==k){
                res.add(s.substring(st,st+k));
                st++;
                cnt--;
            }
        }
        if(res.size()==Math.pow(2,k)){
            return true;
        }
        return false;
    }
}
