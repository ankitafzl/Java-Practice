package Arrays;

public class Shuffle_integers {

	 void shuffleArray(long arr[], int n)
	    {
	        // Your code goes here
	        
	        long ans[]=new long[n];
	        solve(arr,0,n/2,0,n,ans);
	        for(int i=0;i<ans.length;i++){
	            arr[i]=ans[i];
	        }
	    }
	    void solve(long[] arr,int st, int mid,int ind,int n,long[] ans){
	        if(st==n/2){
	            return;
	        }
	        ans[ind++]=arr[st++];
	        ans[ind++]=arr[mid++];
	        solve(arr,st,mid,ind,n,ans);
	    }
}
