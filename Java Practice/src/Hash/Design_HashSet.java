package Hash;
//import java.util.*;
public class Design_HashSet {

	boolean nums[];
    public Design_HashSet() {
       nums=new boolean[1000001];
    }
    
    public void add(int key) {
        nums[key]=true;
    }
    
    public void remove(int key) {
        nums[key]=false;
    }
    
    public boolean contains(int key) {
        
        return nums[key]==false?false:true;
    }
}
