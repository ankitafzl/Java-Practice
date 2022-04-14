package Practice;

public class Shortest_direction {
	
	public static void main(String []args) {
		String str="SSSNEEEW";
		System.out.println(shortestPath(str));
	}

	public static String shortestPath (String S)
    {
        int x=0,y=0;
        String res="";
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='E')
                x++;
            else if(S.charAt(i)=='N')
                y++;
            else if(S.charAt(i)=='S')
                y--;
            else if(S.charAt(i)=='W')
                x--;
        }
        
        if(x>0)
        {
            for(int i=0;i<Math.abs(x);i++)
                res+="E";
        }
        if(y>0)
        {
            for(int i=0;i<Math.abs(y);i++)
                res+="N";
        }
        if(y<0)
        {
            for(int i=0;i<Math.abs(y);i++)
                res+="S";
        }
        if(x<0)
        {
            for(int i=0;i<Math.abs(x);i++)
                res+="W";
        }
        
        return res;
    }
}
