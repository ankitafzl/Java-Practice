package Practice;

public class Backspace_String_Compare {

	public boolean backspaceCompare(String s, String t) {
        int first=s.length()-1;
        int second=t.length()-1;
        int count=0;
        
        while(true){
            count=0;
            while(first>=0 && (count>0 || s.charAt(first)=='#')){
                count+=s.charAt(first)=='#'?1:-1;
                first--;
            }
            count=0;
            while(second>=0 && (count>0 || t.charAt(second)=='#')){
                count+=t.charAt(second)=='#'?1:-1;
                second--;
            }
            if(first>=0 && second>=0 && s.charAt(first)==t.charAt(second)){
                first--;
                second--;
            }
            else{
                break;
            }
        }
        return first==-1 && second==-1;
    }
}
