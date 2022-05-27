package Practice;

public class Increasing_Decreasing_String {

	 public String sortString(String s) {
	        StringBuilder sb=new StringBuilder();
	        int n=s.length();
	        int[] freq=new int[26];
	        
	        for(int i=0;i<n;i++){
	            freq[s.charAt(i)-'a']++;
	        }
	        
	        while(n>0){
	            for(int i=0;i<freq.length;i++){
	                if(freq[i]!=0){
	                    sb.append((char)(i+97));
	                    freq[i]--;
	                    n--;
	                }
	            }
	            for(int i=freq.length-1;i>=0;i--){
	                if(freq[i]!=0){
	                    sb.append((char)(i+97));
	                    freq[i]--;
	                    n--;
	                }
	            }
	        }
	        return sb.toString();
	    }
}
