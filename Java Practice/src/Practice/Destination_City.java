package Practice;
import java.util.*;
public class Destination_City {

	 public String destCity(List<List<String>> paths) {
	        Set<String> set=new HashSet<>();
	        for(List<String> s:paths){
	            set.add(s.get(1));
	        }
	        
	        for(List<String> s:paths){
	            set.remove(s.get(0));
	        }
	        return set.iterator().next();
	    }
}
