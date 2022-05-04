package Practice;
import java.util.*;
public class Twice_Counter {
	public static void main(String []args) {
		String list[] = {"Geeks"," For", "Geeks"};
		System.out.println(countWords(list,list.length));
	}

	public static int countWords(String list[], int n)
    {
        // code here 
        int count=0;
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<list.length;i++){
           int old_count = map.getOrDefault(list[i], 0);
           map.put(list[i], old_count+1);
        }
      
       for(String str: map.keySet())
       {
           if(map.get(str)==2)
           {
               count++;
           }
       }
       return count;
    }
}
