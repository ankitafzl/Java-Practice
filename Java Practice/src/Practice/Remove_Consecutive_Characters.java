package Practice;

public class Remove_Consecutive_Characters {
   public String removeConsecutiveCharacter(String S){
        
        String str="";
        for(int i=0;i<S.length()-1;i++){
            if(S.charAt(i)!=S.charAt(i+1)){
                str+=S.charAt(i);
            }
        }
        str+=S.charAt(S.length()-1);
        return str;
    }
}
