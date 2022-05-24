package Arrays;
import java.util.*;
public class Height_Checker {

	public int heightChecker(int[] heights) {
        int[] clone=heights.clone();
        Arrays.sort(clone);
        int ans=0;
        for(int i=0;i<heights.length;i++){
            if(clone[i]!=heights[i]){
                ans++;
            }
        }
        return ans;
    }
}
