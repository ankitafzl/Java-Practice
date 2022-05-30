package Practice;
import java.util.*;
public class Palindrome_Partitioning {

	List<List<String>> ans=new ArrayList<>();
    public List<List<String>> partition(String s) {
        dfs(s,0,new ArrayList<>());
        return ans;
    }
    void dfs(String s,int st,List<String> list){
        if(s.length()==st){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=st;i<s.length();i++){
            if(isPalindrome(s,st,i)){
                list.add(s.substring(st,i+1));
                dfs(s,i+1,list);
                list.remove(list.size()-1);
            }
        }
    }
    boolean isPalindrome(String s,int st,int end){
        while(st<end){
            if(s.charAt(st)!=s.charAt(end)){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}
