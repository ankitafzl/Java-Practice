package Practice;

public class Robot_Return_to_Origin {

	public boolean judgeCircle(String moves) {
        int hor=0;
        int ver=0;
        
        for(char ch:moves.toCharArray()){
            if(ch=='R'){
                ver++;
            }
            if(ch=='L'){
                ver--;
            }
            if(ch=='U'){
                hor++;
            }
            if(ch=='D'){
                hor--;
            }
        }
        if(hor==0 && ver==0){
            return true;
        }
        return false;
    }
}
