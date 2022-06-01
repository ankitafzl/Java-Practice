package Arrays;
//import java.util.*;
public class Design_HashMap {

	private int x[]=new int[1000001];
    public void MyHashMap() {
        for(int i=0;i<1000001;i++){
            x[i]=-1;
        }
    }
    
    public void put(int key, int value) {
        x[key]=value;
    }
    
    public int get(int key) {
        return x[key];
    }
    
    public void remove(int key) {
        x[key]=-1;
    }
}
